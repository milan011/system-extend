<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="发票编号" prop="xsfpFpbh">
        <el-input
          v-model="queryParams.xsfpFpbh"
          placeholder="请输入发票编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发票种类" prop="xsfpZlbh">
        <el-input
          v-model="queryParams.xsfpZlbh"
          placeholder="请输入发票种类"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门编号" prop="xsfpBmbh">
        <el-input
          v-model="queryParams.xsfpBmbh"
          placeholder="请输入部门编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人员编号" prop="xsfpRybh">
        <el-input
          v-model="queryParams.xsfpRybh"
          placeholder="请输入人员编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <!--<el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:xsfp:add']"
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
          v-hasPermi="['system:xsfp:edit']"
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
          v-hasPermi="['system:xsfp:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:xsfp:export']"
        >导出</el-button>
      </el-col>-->
      <el-col :span="1.5">
        <el-button
          type="info"
          plain
          icon="el-icon-upload2"
          size="mini"
          @click="handleImport"
          v-hasPermi="['erp:invoice:import']"
        >导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="xsfpList" @selection-change="handleSelectionChange">
      <!--<el-table-column type="selection" width="55" align="center" />-->
      <el-table-column label="发票流水" align="center" prop="xsfpFpls" />
      <el-table-column label="发票编号" align="center" prop="xsfpFpbh" />
      <el-table-column label="单据日期" align="center" prop="xsfpDjrq" />
      <el-table-column label="发票种类" align="center" prop="xsfpZlbh" />
      <el-table-column label="付款客户" align="center" prop="xsfpFkkhmc" />
      <!--<el-table-column label="部门编号" align="center" prop="xsfpBmbh" />-->
      <el-table-column label="业务员" align="center" prop="xsfpRyxm" />
      <!--<el-table-column label="币种" align="center" prop="xsfpWbbh" />-->
      <!--<el-table-column label="汇率" align="center" prop="xsfpHl" />-->
      <!--<el-table-column label="折扣政策" align="center" prop="xsfpZkzc" />-->
      <!--<el-table-column label="单位银行" align="center" prop="xsfpYhbh" />-->
      <!--<el-table-column label="到货地点" align="center" prop="xsfpDhdd" />-->
      <el-table-column label="客户地址" align="center" prop="xsfpAddr" />
      <el-table-column label="客户电话" align="center" prop="xsfpTele" />
      <el-table-column label="制单人" align="center" prop="xsfpZdxm" />
      <!--<el-table-column label="记账时间" align="center" prop="xsfpJzsj" />-->
      <!--<el-table-column label="审核人" align="center" prop="xsfpShxm" />-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template v-slot="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:xsfp:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:xsfp:remove']"
          >删除</el-button>
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

    <!-- 添加或修改销售发票对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="发票编号" prop="xsfpFpbh">
          <el-input v-model="form.xsfpFpbh" placeholder="请输入发票编号" />
        </el-form-item>
        <el-form-item label="单据日期日期" prop="xsfpDjrq">
          <el-input v-model="form.xsfpDjrq" placeholder="请输入单据日期日期" />
        </el-form-item>
        <el-form-item label="业务日期" prop="xsfpYwrq">
          <el-input v-model="form.xsfpYwrq" placeholder="请输入业务日期" />
        </el-form-item>
        <el-form-item label="业务类型编号" prop="xsfpYwbh">
          <el-input v-model="form.xsfpYwbh" placeholder="请输入业务类型编号" />
        </el-form-item>
        <el-form-item label="发票种类" prop="xsfpZlbh">
          <el-input v-model="form.xsfpZlbh" placeholder="请输入发票种类" />
        </el-form-item>
        <el-form-item label="售达客户编号" prop="xsfpShdkh">
          <el-input v-model="form.xsfpShdkh" placeholder="请输入售达客户编号" />
        </el-form-item>
        <el-form-item label="售达客户名称" prop="xsfpShdkhmc">
          <el-input v-model="form.xsfpShdkhmc" placeholder="请输入售达客户名称" />
        </el-form-item>
        <el-form-item label="送达客户编号" prop="xsfpSodkh">
          <el-input v-model="form.xsfpSodkh" placeholder="请输入送达客户编号" />
        </el-form-item>
        <el-form-item label="送达客户编号" prop="xsfpSodkhmc">
          <el-input v-model="form.xsfpSodkhmc" placeholder="请输入送达客户编号" />
        </el-form-item>
        <el-form-item label="收票客户编号" prop="xsfpSpkh">
          <el-input v-model="form.xsfpSpkh" placeholder="请输入收票客户编号" />
        </el-form-item>
        <el-form-item label="收票客户名称" prop="xsfpSpkhmc">
          <el-input v-model="form.xsfpSpkhmc" placeholder="请输入收票客户名称" />
        </el-form-item>
        <el-form-item label="付款客户编号" prop="xsfpFkkh">
          <el-input v-model="form.xsfpFkkh" placeholder="请输入付款客户编号" />
        </el-form-item>
        <el-form-item label="付款客户名称" prop="xsfpFkkhmc">
          <el-input v-model="form.xsfpFkkhmc" placeholder="请输入付款客户名称" />
        </el-form-item>
        <el-form-item label="部门编号" prop="xsfpBmbh">
          <el-input v-model="form.xsfpBmbh" placeholder="请输入部门编号" />
        </el-form-item>
        <el-form-item label="人员编号" prop="xsfpRybh">
          <el-input v-model="form.xsfpRybh" placeholder="请输入人员编号" />
        </el-form-item>
        <el-form-item label="人员姓名" prop="xsfpRyxm">
          <el-input v-model="form.xsfpRyxm" placeholder="请输入人员姓名" />
        </el-form-item>
        <el-form-item label="币种" prop="xsfpWbbh">
          <el-input v-model="form.xsfpWbbh" placeholder="请输入币种" />
        </el-form-item>
        <el-form-item label="汇率" prop="xsfpHl">
          <el-input v-model="form.xsfpHl" placeholder="请输入汇率" />
        </el-form-item>
        <el-form-item label="折扣政策" prop="xsfpZkzc">
          <el-input v-model="form.xsfpZkzc" placeholder="请输入折扣政策" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpFsbh">
          <el-input v-model="form.xsfpFsbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJsbh">
          <el-input v-model="form.xsfpJsbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPjhm">
          <el-input v-model="form.xsfpPjhm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHkrq">
          <el-input v-model="form.xsfpHkrq" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="单位银行" prop="xsfpYhbh">
          <el-input v-model="form.xsfpYhbh" placeholder="请输入单位银行" />
        </el-form-item>
        <el-form-item label="到货地点" prop="xsfpDhdd">
          <el-input v-model="form.xsfpDhdd" placeholder="请输入到货地点" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpDzhm">
          <el-input v-model="form.xsfpDzhm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPznm">
          <el-input v-model="form.xsfpPznm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPzrq">
          <el-input v-model="form.xsfpPzrq" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPzbh">
          <el-input v-model="form.xsfpPzbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPznd">
          <el-input v-model="form.xsfpPznd" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpFwbz">
          <el-input v-model="form.xsfpFwbz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="客户地址" prop="xsfpAddr">
          <el-input v-model="form.xsfpAddr" placeholder="请输入客户地址" />
        </el-form-item>
        <el-form-item label="客户电话" prop="xsfpTele">
          <el-input v-model="form.xsfpTele" placeholder="请输入客户电话" />
        </el-form-item>
        <el-form-item label="开户行" prop="xsfpKhh">
          <el-input v-model="form.xsfpKhh" placeholder="请输入开户行" />
        </el-form-item>
        <el-form-item label="银行账号" prop="xsfpYhzh">
          <el-input v-model="form.xsfpYhzh" placeholder="请输入银行账号" />
        </el-form-item>
        <el-form-item label="税号" prop="xsfpSh">
          <el-input v-model="form.xsfpSh" placeholder="请输入税号" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpDydate">
          <el-input v-model="form.xsfpDydate" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpDyperson">
          <el-input v-model="form.xsfpDyperson" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="收款人" prop="xsfpSkbh">
          <el-input v-model="form.xsfpSkbh" placeholder="请输入收款人" />
        </el-form-item>
        <el-form-item label="付款人" prop="xsfpFhbh">
          <el-input v-model="form.xsfpFhbh" placeholder="请输入付款人" />
        </el-form-item>
        <el-form-item label="制单人" prop="xsfpZdxm">
          <el-input v-model="form.xsfpZdxm" placeholder="请输入制单人" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJzysbz">
          <el-input v-model="form.xsfpJzysbz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJzysxm">
          <el-input v-model="form.xsfpJzysxm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJzysrq">
          <el-input v-model="form.xsfpJzysrq" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJzbz">
          <el-input v-model="form.xsfpJzbz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpJzxm">
          <el-input v-model="form.xsfpJzxm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="记账时间" prop="xsfpJzsj">
          <el-input v-model="form.xsfpJzsj" placeholder="请输入记账时间" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfjz">
          <el-input v-model="form.xsfpSfjz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfqxjz">
          <el-input v-model="form.xsfpSfqxjz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpDqzk">
          <el-input v-model="form.xsfpDqzk" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfsc">
          <el-input v-model="form.xsfpSfsc" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfxg">
          <el-input v-model="form.xsfpSfxg" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfqr">
          <el-input v-model="form.xsfpSfqr" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfczx">
          <el-input v-model="form.xsfpSfczx" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSfcdj">
          <el-input v-model="form.xsfpSfcdj" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHtbh">
          <el-input v-model="form.xsfpHtbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHtls">
          <el-input v-model="form.xsfpHtls" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpFzbh">
          <el-input v-model="form.xsfpFzbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpXzbh">
          <el-input v-model="form.xsfpXzbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpShlc">
          <el-input v-model="form.xsfpShlc" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="审核标志" prop="xsfpShbz">
          <el-input v-model="form.xsfpShbz" placeholder="请输入审核标志" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpShrq">
          <el-input v-model="form.xsfpShrq" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="审核人" prop="xsfpShxm">
          <el-input v-model="form.xsfpShxm" placeholder="请输入审核人" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpLybh">
          <el-input v-model="form.xsfpLybh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpLyls">
          <el-input v-model="form.xsfpLyls" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="文本1" prop="xsfpC1">
          <el-input v-model="form.xsfpC1" placeholder="请输入文本1" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC2">
          <el-input v-model="form.xsfpC2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC3">
          <el-input v-model="form.xsfpC3" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC4">
          <el-input v-model="form.xsfpC4" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC5">
          <el-input v-model="form.xsfpC5" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC6">
          <el-input v-model="form.xsfpC6" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC7">
          <el-input v-model="form.xsfpC7" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC8">
          <el-input v-model="form.xsfpC8" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC9">
          <el-input v-model="form.xsfpC9" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpC10">
          <el-input v-model="form.xsfpC10" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU1">
          <el-input v-model="form.xsfpU1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU2">
          <el-input v-model="form.xsfpU2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU3">
          <el-input v-model="form.xsfpU3" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU4">
          <el-input v-model="form.xsfpU4" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU5">
          <el-input v-model="form.xsfpU5" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpU6">
          <el-input v-model="form.xsfpU6" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="备注" prop="xsfpBz">
          <el-input v-model="form.xsfpBz" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpGsbh">
          <el-input v-model="form.xsfpGsbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSybbh">
          <el-input v-model="form.xsfpSybbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpPqbh">
          <el-input v-model="form.xsfpPqbh" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpGsbhbak">
          <el-input v-model="form.xsfpGsbhbak" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpGsmcbak">
          <el-input v-model="form.xsfpGsmcbak" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpBmmc">
          <el-input v-model="form.xsfpBmmc" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpBmbhbak">
          <el-input v-model="form.xsfpBmbhbak" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpRybhbak">
          <el-input v-model="form.xsfpRybhbak" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpRyxmbak">
          <el-input v-model="form.xsfpRyxmbak" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpSpdx">
          <el-input v-model="form.xsfpSpdx" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpDrbs">
          <el-input v-model="form.xsfpDrbs" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHzbz">
          <el-input v-model="form.xsfpHzbz" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHzr">
          <el-input v-model="form.xsfpHzr" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHzrq">
          <el-input v-model="form.xsfpHzrq" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="xsfpHzsm">
          <el-input v-model="form.xsfpHzsm" placeholder="请输入${comment}" />
        </el-form-item>
        <el-divider content-position="center">销售发票明细信息</el-divider>
        <el-row :gutter="10" class="mb8">
          <el-col :span="1.5">
            <el-button type="primary" icon="el-icon-plus" size="mini" @click="handleAddErpXsfpmx">添加</el-button>
          </el-col>
          <el-col :span="1.5">
            <el-button type="danger" icon="el-icon-delete" size="mini" @click="handleDeleteErpXsfpmx">删除</el-button>
          </el-col>
        </el-row>
        <el-table :data="erpXsfpmxList" :row-class-name="rowErpXsfpmxIndex" @selection-change="handleErpXsfpmxSelectionChange" ref="erpXsfpmx">
          <el-table-column type="selection" width="50" align="center" />
          <el-table-column label="序号" align="center" prop="index" width="50"/>
          <el-table-column label="仓库名称" prop="xsfpmxCkbh" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkbh" placeholder="请输入仓库名称" />
            </template>
          </el-table-column>
          <el-table-column label="产品编号" prop="xsfpmxWlbh" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxWlbh" placeholder="请输入产品编号" />
            </template>
          </el-table-column>
          <el-table-column label="产品名称" prop="xsfpmxWlmc" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxWlmc" placeholder="请输入产品名称" />
            </template>
          </el-table-column>
          <el-table-column label="批次号" prop="xsfpmxPch" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxPch" placeholder="请输入批次号" />
            </template>
          </el-table-column>
          <el-table-column label="物料状态" prop="xsfpmxWlzt" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxWlzt" placeholder="请输入物料状态" />
            </template>
          </el-table-column>
          <el-table-column label="收支项目" prop="xsfpmxSzxm" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxSzxm" placeholder="请输入收支项目" />
            </template>
          </el-table-column>
          <el-table-column label="订单编号" prop="xsfpmxDdbh" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxDdbh" placeholder="请输入订单编号" />
            </template>
          </el-table-column>
          <el-table-column label="提单编号" prop="xsfpmxTdbh" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxTdbh" placeholder="请输入提单编号" />
            </template>
          </el-table-column>
          <el-table-column label="主数量" prop="xsfpmxZsl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxZsl" placeholder="请输入主数量" />
            </template>
          </el-table-column>
          <el-table-column label="销售数量" prop="xsfpmxFsl1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxFsl1" placeholder="请输入销售数量" />
            </template>
          </el-table-column>
          <el-table-column label="辅助数量" prop="xsfpmxFsl2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxFsl2" placeholder="请输入辅助数量" />
            </template>
          </el-table-column>
          <el-table-column label="原主含税价" prop="xsfpmxYzhsj" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYzhsj" placeholder="请输入原主含税价" />
            </template>
          </el-table-column>
          <el-table-column label="单笔折扣比率" prop="xsfpmxDbzkbl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxDbzkbl" placeholder="请输入单笔折扣比率" />
            </template>
          </el-table-column>
          <el-table-column label="总额折扣比率" prop="xsfpmxZezkbl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxZezkbl" placeholder="请输入总额折扣比率" />
            </template>
          </el-table-column>
          <el-table-column label="折扣金额" prop="xsfpmxYzkje" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYzkje" placeholder="请输入折扣金额" />
            </template>
          </el-table-column>
          <el-table-column label="含税金额" prop="xsfpmxYhse" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYhse" placeholder="请输入含税金额" />
            </template>
          </el-table-column>
          <el-table-column label="税率" prop="xsfpmxSl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxSl" placeholder="请输入税率" />
            </template>
          </el-table-column>
          <el-table-column label="销售单价" prop="xsfpmxYzxsj" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYzxsj" placeholder="请输入销售单价" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxBzxsj" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxBzxsj" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="销售金额" prop="xsfpmxYxse" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYxse" placeholder="请输入销售金额" />
            </template>
          </el-table-column>
          <el-table-column label="税额" prop="xsfpmxYse" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYse" placeholder="请输入税额" />
            </template>
          </el-table-column>
          <el-table-column label="回款额" prop="xsfpmxYhke" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYhke" placeholder="请输入回款额" />
            </template>
          </el-table-column>
          <el-table-column label="回款数量" prop="xsfpmxHksl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxHksl" placeholder="请输入回款数量" />
            </template>
          </el-table-column>
          <el-table-column label="是否出库" prop="xsfpmxSfck" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxSfck" placeholder="请输入是否出库" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkbz" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkbz" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCksl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCksl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkfsl1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkfsl1" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkfsl2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkfsl2" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkje" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkje" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxTdzhsj" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxTdzhsj" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxTdzsl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxTdzsl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxTdyhse" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxTdyhse" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxTdbhse" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxTdbhse" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxHzzsl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxHzzsl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxHzfsl1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxHzfsl1" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxHzfsl2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxHzfsl2" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxYhze" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYhze" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxBhze" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxBhze" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxDczsl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxDczsl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxDcfsl1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxDcfsl1" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxDcfsl2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxDcfsl2" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxYdce" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYdce" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxBdce" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxBdce" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="立账日期" prop="xsfpmxLzrq" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxLzrq" placeholder="请输入立账日期" />
            </template>
          </el-table-column>
          <el-table-column label="预回款日期" prop="xsfpmxYhkrq" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYhkrq" placeholder="请输入预回款日期" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxZxpdyj" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxZxpdyj" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxZxtszc" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxZxtszc" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxYywrq" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYywrq" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="文本1" prop="xsfpmxC1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC1" placeholder="请输入文本1" />
            </template>
          </el-table-column>
          <el-table-column label="文本2" prop="xsfpmxC2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC2" placeholder="请输入文本2" />
            </template>
          </el-table-column>
          <el-table-column label="文本3" prop="xsfpmxC3" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC3" placeholder="请输入文本3" />
            </template>
          </el-table-column>
          <el-table-column label="文本4" prop="xsfpmxC4" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC4" placeholder="请输入文本4" />
            </template>
          </el-table-column>
          <el-table-column label="文本5" prop="xsfpmxC5" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC5" placeholder="请输入文本5" />
            </template>
          </el-table-column>
          <el-table-column label="文本6" prop="xsfpmxC6" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC6" placeholder="请输入文本6" />
            </template>
          </el-table-column>
          <el-table-column label="文本7" prop="xsfpmxC7" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC7" placeholder="请输入文本7" />
            </template>
          </el-table-column>
          <el-table-column label="文本8" prop="xsfpmxC8" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC8" placeholder="请输入文本8" />
            </template>
          </el-table-column>
          <el-table-column label="文本9" prop="xsfpmxC9" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC9" placeholder="请输入文本9" />
            </template>
          </el-table-column>
          <el-table-column label="文本10" prop="xsfpmxC10" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxC10" placeholder="请输入文本10" />
            </template>
          </el-table-column>
          <el-table-column label="数字1" prop="xsfpmxU1" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU1" placeholder="请输入数字1" />
            </template>
          </el-table-column>
          <el-table-column label="数字2" prop="xsfpmxU2" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU2" placeholder="请输入数字2" />
            </template>
          </el-table-column>
          <el-table-column label="数字3" prop="xsfpmxU3" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU3" placeholder="请输入数字3" />
            </template>
          </el-table-column>
          <el-table-column label="数字4" prop="xsfpmxU4" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU4" placeholder="请输入数字4" />
            </template>
          </el-table-column>
          <el-table-column label="数字5" prop="xsfpmxU5" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU5" placeholder="请输入数字5" />
            </template>
          </el-table-column>
          <el-table-column label="数字6" prop="xsfpmxU6" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxU6" placeholder="请输入数字6" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxYstdls" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYstdls" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxYstdfl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxYstdfl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxBcyhsl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxBcyhsl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkls" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkls" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxCkfl" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxCkfl" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxJgys" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxJgys" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxJgzc" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxJgzc" placeholder="请输入$comment" />
            </template>
          </el-table-column>
          <el-table-column label="$comment" prop="xsfpmxWlbhbak" width="150">
            <template v-slot="scope">
              <el-input v-model="scope.row.xsfpmxWlbhbak" placeholder="请输入$comment" />
            </template>
          </el-table-column>
        </el-table>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload
        ref="upload"
        :limit="1"
        accept=".xlsx, .xls"
        :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport"
        :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress"
        :on-success="handleFileSuccess"
        :auto-upload="false"
        drag
      >
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <!--<div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的用户数据
          </div>-->
          <span>仅允许导入xls、xlsx格式文件。</span>
          <el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;" @click="importTemplate">下载模板</el-link>
        </div>
      </el-upload>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitFileForm">确 定</el-button>
        <el-button @click="upload.open = false">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listXsfp, getXsfp, delXsfp, addXsfp, updateXsfp } from "@/api/erp/xsfp";
import { getToken } from '@/utils/auth'

export default {
  name: "Xsfp",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 子表选中数据
      checkedErpXsfpmx: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 销售发票表格数据
      xsfpList: [],
      // 销售发票明细表格数据
      erpXsfpmxList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 用户导入参数
      upload: {
        // 是否显示弹出层（用户导入）
        open: false,
        // 弹出层标题（用户导入）
        title: "",
        // 是否禁用上传
        isUploading: false,
        // 是否更新已经存在的用户数据
        updateSupport: 0,
        // 设置上传的请求头部
        headers: { Authorization: "Bearer " + getToken() },
        // 上传的地址
        url: process.env.VUE_APP_BASE_API + "/erp/xsfp/importData"
      },
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        xsfpFpbh: null,
        xsfpZlbh: null,
        xsfpBmbh: null,
        xsfpRybh: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询销售发票列表 */
    getList() {
      this.loading = true;
      listXsfp(this.queryParams).then(response => {
        this.xsfpList = response.rows;
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
        xsfpFpls: null,
        xsfpFpbh: null,
        xsfpYwbs: null,
        xsfpPjlx: null,
        xsfpZbpjlx: null,
        xsfpHsdx: null,
        xsfpDjrq: null,
        xsfpYwrq: null,
        xsfpXgsj: null,
        xsfpQcbz: null,
        xsfpFpbz: null,
        xsfpZfbz: null,
        xsfpZfxm: null,
        xsfpYwbh: null,
        xsfpZlbh: null,
        xsfpSfls: null,
        xsfpShdkh: null,
        xsfpShdkhmc: null,
        xsfpSodkh: null,
        xsfpSodkhmc: null,
        xsfpSpkh: null,
        xsfpSpkhmc: null,
        xsfpFkkh: null,
        xsfpFkkhmc: null,
        xsfpBmbh: null,
        xsfpRybh: null,
        xsfpRyxm: null,
        xsfpWbbh: null,
        xsfpHl: null,
        xsfpZkzc: null,
        xsfpFsbh: null,
        xsfpJsbh: null,
        xsfpPjhm: null,
        xsfpHkrq: null,
        xsfpYhbh: null,
        xsfpDhdd: null,
        xsfpDzhm: null,
        xsfpPznm: null,
        xsfpPzrq: null,
        xsfpPzbh: null,
        xsfpPznd: null,
        xsfpFwbz: null,
        xsfpAddr: null,
        xsfpTele: null,
        xsfpKhh: null,
        xsfpYhzh: null,
        xsfpSh: null,
        xsfpDydate: null,
        xsfpDyperson: null,
        xsfpSkbh: null,
        xsfpFhbh: null,
        xsfpZdxm: null,
        xsfpJzysbz: null,
        xsfpJzysxm: null,
        xsfpJzysrq: null,
        xsfpJzbz: null,
        xsfpJzxm: null,
        xsfpJzsj: null,
        xsfpSfjz: null,
        xsfpSfqxjz: null,
        xsfpDqzk: null,
        xsfpSfsc: null,
        xsfpSfxg: null,
        xsfpSfqr: null,
        xsfpSfczx: null,
        xsfpSfcdj: null,
        xsfpHtbh: null,
        xsfpHtls: null,
        xsfpFzbh: null,
        xsfpXzbh: null,
        xsfpShlc: null,
        xsfpShbz: null,
        xsfpShrq: null,
        xsfpShxm: null,
        xsfpLybh: null,
        xsfpLyls: null,
        xsfpC1: null,
        xsfpC2: null,
        xsfpC3: null,
        xsfpC4: null,
        xsfpC5: null,
        xsfpC6: null,
        xsfpC7: null,
        xsfpC8: null,
        xsfpC9: null,
        xsfpC10: null,
        xsfpU1: null,
        xsfpU2: null,
        xsfpU3: null,
        xsfpU4: null,
        xsfpU5: null,
        xsfpU6: null,
        xsfpBz: null,
        xsfpGsbh: null,
        xsfpSybbh: null,
        xsfpPqbh: null,
        xsfpGsbhbak: null,
        xsfpGsmcbak: null,
        xsfpBmmc: null,
        xsfpBmbhbak: null,
        xsfpRybhbak: null,
        xsfpRyxmbak: null,
        xsfpSpdx: null,
        xsfpDrbs: null,
        xsfpHzbz: null,
        xsfpHzr: null,
        xsfpHzrq: null,
        xsfpHzsm: null
      };
      this.erpXsfpmxList = [];
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
      this.ids = selection.map(item => item.xsfpFpls)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加销售发票";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const xsfpFpls = row.xsfpFpls || this.ids
      getXsfp(xsfpFpls).then(response => {
        this.form = response.data;
        this.erpXsfpmxList = response.data.erpXsfpmxList;
        this.open = true;
        this.title = "修改销售发票";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          this.form.erpXsfpmxList = this.erpXsfpmxList;
          if (this.form.xsfpFpls != null) {
            updateXsfp(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addXsfp(this.form).then(response => {
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
      const xsfpFplss = row.xsfpFpls || this.ids;
      this.$modal.confirm('是否确认删除销售发票编号为"' + xsfpFplss + '"的数据项？').then(function() {
        return delXsfp(xsfpFplss);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
	/** 销售发票明细序号 */
    rowErpXsfpmxIndex({ row, rowIndex }) {
      row.index = rowIndex + 1;
    },
    /** 销售发票明细添加按钮操作 */
    handleAddErpXsfpmx() {
      let obj = {};
      obj.xsfpmxCkbh = "";
      obj.xsfpmxWlbh = "";
      obj.xsfpmxWlmc = "";
      obj.xsfpmxPch = "";
      obj.xsfpmxWlzt = "";
      obj.xsfpmxSzxm = "";
      obj.xsfpmxDdbh = "";
      obj.xsfpmxTdbh = "";
      obj.xsfpmxZsl = "";
      obj.xsfpmxFsl1 = "";
      obj.xsfpmxFsl2 = "";
      obj.xsfpmxYzhsj = "";
      obj.xsfpmxDbzkbl = "";
      obj.xsfpmxZezkbl = "";
      obj.xsfpmxYzkje = "";
      obj.xsfpmxYhse = "";
      obj.xsfpmxSl = "";
      obj.xsfpmxYzxsj = "";
      obj.xsfpmxBzxsj = "";
      obj.xsfpmxYxse = "";
      obj.xsfpmxYse = "";
      obj.xsfpmxYhke = "";
      obj.xsfpmxHksl = "";
      obj.xsfpmxSfck = "";
      obj.xsfpmxCkbz = "";
      obj.xsfpmxCksl = "";
      obj.xsfpmxCkfsl1 = "";
      obj.xsfpmxCkfsl2 = "";
      obj.xsfpmxCkje = "";
      obj.xsfpmxTdzhsj = "";
      obj.xsfpmxTdzsl = "";
      obj.xsfpmxTdyhse = "";
      obj.xsfpmxTdbhse = "";
      obj.xsfpmxHzzsl = "";
      obj.xsfpmxHzfsl1 = "";
      obj.xsfpmxHzfsl2 = "";
      obj.xsfpmxYhze = "";
      obj.xsfpmxBhze = "";
      obj.xsfpmxDczsl = "";
      obj.xsfpmxDcfsl1 = "";
      obj.xsfpmxDcfsl2 = "";
      obj.xsfpmxYdce = "";
      obj.xsfpmxBdce = "";
      obj.xsfpmxLzrq = "";
      obj.xsfpmxYhkrq = "";
      obj.xsfpmxZxpdyj = "";
      obj.xsfpmxZxtszc = "";
      obj.xsfpmxYywrq = "";
      obj.xsfpmxC1 = "";
      obj.xsfpmxC2 = "";
      obj.xsfpmxC3 = "";
      obj.xsfpmxC4 = "";
      obj.xsfpmxC5 = "";
      obj.xsfpmxC6 = "";
      obj.xsfpmxC7 = "";
      obj.xsfpmxC8 = "";
      obj.xsfpmxC9 = "";
      obj.xsfpmxC10 = "";
      obj.xsfpmxU1 = "";
      obj.xsfpmxU2 = "";
      obj.xsfpmxU3 = "";
      obj.xsfpmxU4 = "";
      obj.xsfpmxU5 = "";
      obj.xsfpmxU6 = "";
      obj.xsfpmxYstdls = "";
      obj.xsfpmxYstdfl = "";
      obj.xsfpmxBcyhsl = "";
      obj.xsfpmxCkls = "";
      obj.xsfpmxCkfl = "";
      obj.xsfpmxJgys = "";
      obj.xsfpmxJgzc = "";
      obj.xsfpmxWlbhbak = "";
      this.erpXsfpmxList.push(obj);
    },
    /** 销售发票明细删除按钮操作 */
    handleDeleteErpXsfpmx() {
      if (this.checkedErpXsfpmx.length == 0) {
        this.$modal.msgError("请先选择要删除的销售发票明细数据");
      } else {
        const erpXsfpmxList = this.erpXsfpmxList;
        const checkedErpXsfpmx = this.checkedErpXsfpmx;
        this.erpXsfpmxList = erpXsfpmxList.filter(function(item) {
          return checkedErpXsfpmx.indexOf(item.index) == -1
        });
      }
    },
    /** 复选框选中数据 */
    handleErpXsfpmxSelectionChange(selection) {
      this.checkedErpXsfpmx = selection.map(item => item.index)
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "发票导入";
      this.upload.open = true;
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download('system/user/importTemplate', {
      }, `user_template_${new Date().getTime()}.xlsx`)
    },
    // 文件上传中处理
    handleFileUploadProgress(event, file, fileList) {
      this.upload.isUploading = true;
    },
    // 文件上传成功处理
    handleFileSuccess(response, file, fileList) {
      this.upload.open = false;
      this.upload.isUploading = false;
      this.$refs.upload.clearFiles();
      this.$alert("<div style='overflow: auto;overflow-x: hidden;max-height: 70vh;padding: 10px 20px 0;'>" + response.msg + "</div>", "导入结果", { dangerouslyUseHTMLString: true });
      this.getList();
    },
    // 提交上传文件
    submitFileForm() {
      this.$refs.upload.submit();
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/xsfp/export', {
        ...this.queryParams
      }, `xsfp_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
