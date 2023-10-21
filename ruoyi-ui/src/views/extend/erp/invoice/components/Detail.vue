<template>
  <div class="app-container">
    <el-table v-loading="loading" :data="fpmxList">
      <el-table-column label="发票流水" align="center" prop="xsfpmxFpls" />
      <el-table-column label="物料编号" align="center" prop="xsfpmxWlbh" />
      <el-table-column label="数量" align="center" prop="xsfpmxZsl" />
      <el-table-column label="开票价" align="center" prop="xsfpmxYzhsj" />
      <el-table-column label="含税金额" align="center" prop="xsfpmxYhse" />
    </el-table>
  </div>
</template>
<script>
import { getXsfpmx } from '@/api/erp/xsfp'
export default {
  name: "Detail",
  data() {
    return {
      loading: true,
      total: 0,
      //发票明细
      fpmxList: [],
    }
  },
  created() {
    // this.getFpmxList();
  },
  methods: {
    fpmxListFetch(row){
      console.log('哥,你调用我了')
      getXsfpmx(row.xsfpFpls).then(response=>{

        this.fpmxList = response.rows
        this.total = response.total
        this.loading = false
      })
    }
  }
}
</script>
