<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="单据日期" prop="xsddDjrq">
        <el-input
          v-model="queryParams.xsddDjrq"
          placeholder="请输入单据日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单编号" prop="xsddDdbh">
        <el-input
          v-model="queryParams.xsddDdbh"
          placeholder="请输入订单编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="品级类型" prop="xsddPjlx">
        <el-input
          v-model="queryParams.xsddPjlx"
          placeholder="请输入品级类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <!--<el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['erp:xsdd:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['erp:xsdd:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['erp:xsdd:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['erp:xsdd:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>-->

    <el-table v-loading="loading" :data="xsddList" @selection-change="handleSelectionChange">
      <!--<el-table-column type="selection" width="55" align="center" />-->
      <el-table-column label="订单流水" align="center" prop="xsddDdls" />
      <el-table-column label="单据日期" align="center" prop="xsddDjrq" />
      <el-table-column label="订单编号" align="center" prop="xsddDdbh" />
      <el-table-column label="售达客户" align="center" prop="xsddShdkh" />
      <el-table-column label="收发流水" align="center" prop="xsddSfls" />
      <el-table-column label="底价" align="center" prop="xsddXsdj" />
      <el-table-column label="备注" align="center" prop="xsddBz" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template v-slot="scope">
          <!--<el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['erp:xsdd:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['erp:xsdd:remove']"
          >删除</el-button>-->
          <el-button
            size="mini"
            type="text"
            icon="el-icon-info"
            @click="handleShowDetail(scope.row)"
            v-hasPermi="['erp:xsdd:list']"
          >查看明细</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改销售订单对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listXsdd, getXsdd, delXsdd, addXsdd, updateXsdd } from "@/api/erp/xsdd";

export default {
  name: "Xsdd",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 销售订单表格数据
      xsddList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        xsddDjrq: null,
        xsddDdbh: null,
        xsddPjlx: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        xsddSffp: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        xsddGsbh: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询销售订单列表 */
    getList() {
      this.loading = true;
      listXsdd(this.queryParams).then(response => {
        this.xsddList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        xsddDdls: null,
        xsddDjrq: null,
        xsddDdbh: null,
        xsddQcbz: null,
        xsddPjlx: null,
        xsddYwbs: null,
        xsddDdbz: null,
        xsddDdzt: null,
        xsddLxbh: null,
        xsddShdkh: null,
        xsddShdkhmc: null,
        xsddSodkh: null,
        xsddSodkhmc: null,
        xsddSpkh: null,
        xsddSpkhmc: null,
        xsddFkkh: null,
        xsddFkkhmc: null,
        xsddSfls: null,
        xsddBmbh: null,
        xsddRybh: null,
        xsddWbbh: null,
        xsddHl: null,
        xsddXsdj: null,
        xsddZkzc: null,
        xsddFsbh: null,
        xsddYwrq: null,
        xsddSprq: null,
        xsddXgsj: null,
        xsddWfdb: null,
        xsddDfdb: null,
        xsddLxr: null,
        xsddDhdd: null,
        xsddTzrq: null,
        xsddPzr: null,
        xsddZdxm: null,
        xsddShlc: null,
        xsddShbz: null,
        xsddShrq: null,
        xsddShxm: null,
        xsddC1: null,
        xsddC2: null,
        xsddC3: null,
        xsddC4: null,
        xsddC5: null,
        xsddC6: null,
        xsddC7: null,
        xsddC8: null,
        xsddC9: null,
        xsddC10: null,
        xsddU1: null,
        xsddU2: null,
        xsddU3: null,
        xsddU4: null,
        xsddU5: null,
        xsddU6: null,
        xsddYwbh: null,
        xsddDyperson: null,
        xsddDydate: null,
        xsddHtbh: null,
        xsddHtls: null,
        xsddSfczx: null,
        xsddSfcdj: null,
        xsddSfqr: null,
        xsddSfxg: null,
        xsddSfsc: null,
        xsddSfjz: null,
        xsddYhke: null,
        xsddBz: null,
        xsddSffp: null,
        xsddGsbh: null,
        xsddXyls: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.xsddDdls)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加销售订单";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const xsddDdls = row.xsddDdls || this.ids
      getXsdd(xsddDdls).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改销售订单";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.xsddDdls != null) {
            updateXsdd(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addXsdd(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const xsddDdlss = row.xsddDdls || this.ids;
      this.$modal.confirm('是否确认删除销售订单编号为"' + xsddDdlss + '"的数据项？').then(function() {
        return delXsdd(xsddDdlss);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /*订单明细列表*/
    handleShowDetail(row){
      console.log('查看明细', row)
      /*this.detailOpen = true
      this.$nextTick(() => {
        this.$refs.fpmxList.fpmxListFetch(row)
      })*/
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('erp/xsdd/export', {
        ...this.queryParams
      }, `xsdd_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
