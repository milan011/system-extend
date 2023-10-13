<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="物料编号" prop="WLBH" width="50%">
        <el-input
          v-model="queryParams.WLBH"
          placeholder="请输入物料编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="物料名称" prop="WLMC">
        <el-input
          v-model="queryParams.WLMC"
          placeholder="请输入物料名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!--<el-form-item label="规格型号" prop="GGXH">
        <el-input
          v-model="queryParams.GGXH"
          placeholder="请输入规格型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>-->
      <el-form-item label="pch" prop="PCH">
        <el-input
          v-model="queryParams.PCH"
          placeholder="请输入pch"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!--<el-form-item label="备注" prop="BZ">
        <el-input
          v-model="queryParams.BZ"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>-->
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
          v-hasPermi="['erp:wlbgmx:add']"
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
          v-hasPermi="['erp:wlbgmx:edit']"
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
          v-hasPermi="['erp:wlbgmx:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['erp:wlbgmx:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>-->

    <el-table v-loading="loading" :data="wlbgmxList" @selection-change="handleSelectionChange">
      <!--<el-table-column type="selection" width="55" align="center" />-->
      <el-table-column label="物料编号" width="120px" align="center" prop="wlbh" />
      <el-table-column label="物料名称" align="center" prop="wlmc" />
      <el-table-column label="规格型号" align="center" prop="ggxh" />
      <el-table-column label="pch" align="center">
        <template v-slot="scope">
          <span style="white-space: pre">{{ scope.row.pch }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注" align="center" prop="bz" />
      <el-table-column label="操作" width="100px" align="center" class-name="small-padding fixed-width">
        <template v-slot="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['erp:wlbgmx:edit']"
          >修改</el-button>
          <!--<el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['erp:wlbgmx:remove']"
          >删除</el-button>-->
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

    <!-- 添加或修改物料对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="物料编号" prop="WLBH">
          <el-input v-model="form.WLBH" placeholder="请输入物料编号" />
        </el-form-item>
        <el-form-item label="物料名称" prop="WLMC">
          <el-input v-model="form.WLMC" placeholder="请输入物料名称" />
        </el-form-item>
        <el-form-item label="规格型号" prop="GGXH">
          <el-input v-model="form.GGXH" placeholder="请输入规格型号" />
        </el-form-item>
        <el-form-item label="pch" prop="PCH">
          <el-input v-model="form.PCH" placeholder="请输入pch" />
        </el-form-item>
        <el-form-item label="备注" prop="BZ">
          <el-input v-model="form.BZ" placeholder="请输入备注" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listWlbgmx, getWlbgmx, delWlbgmx, addWlbgmx, updateWlbgmx } from "@/api/erp/wlbgmx";

export default {
  name: "Wlbgmx",
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
      // 物料表格数据
      wlbgmxList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        WLBH: null,
        WLMC: null,
        GGXH: null,
        PCH: null,
        BZ: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        WLBH: [
          { required: true, message: "物料编号不能为空", trigger: "blur" }
        ],
        WLMC: [
          { required: true, message: "物料名称不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询物料列表 */
    getList() {
      this.loading = true;
      listWlbgmx(this.queryParams).then(response => {
        this.wlbgmxList = response.rows;
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
        WLBH: null,
        WLMC: null,
        GGXH: null,
        PCH: null,
        BZ: null
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
      this.ids = selection.map(item => item.WLBH)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加物料";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      console.log(row)
      const WLBH = row.wlbh || this.ids
      getWlbgmx(WLBH).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改物料";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.WLBH != null) {
            updateWlbgmx(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addWlbgmx(this.form).then(response => {
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
      const WLBHs = row.WLBH || this.ids;
      this.$modal.confirm('是否确认删除物料编号为"' + WLBHs + '"的数据项？').then(function() {
        return delWlbgmx(WLBHs);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('erp/wlbgmx/export', {
        ...this.queryParams
      }, `wlbgmx_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
