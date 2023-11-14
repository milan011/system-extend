<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col v-hasPermi="['erp:wlbh:list']" align="center" :span="4">
        <el-card class="operate-card" @click.native="toMaterialHandle" shadow="always">
          物料编号
        </el-card>
      </el-col>
      <el-col v-hasPermi="['erp:xsfp:list']" align="center" :span="4">
        <el-card class="operate-card" @click.native="toInvoiceHandle" shadow="always">
          销售发票
        </el-card>
      </el-col>
      <el-col v-hasPermi="['erp:xsdd:list']" align="center" :span="4">
        <el-card class="operate-card" @click.native="toOrderHandle" shadow="always">
          销售订单
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>
<script>
export default {
  name: "ErpIndex",
  data() {
    return {

    };
  },
  methods: {
    toMaterialHandle(){
      console.log('处理物料')
      this.$router.push('erp/material')
    },
    toInvoiceHandle(){
      console.log('销售发票')
      this.$router.push('erp/invoice')
    },
    toOrderHandle(){
      this.$router.push('erp/order')
    }

  }
};
</script>

<style scoped lang="scss">
.operate-card {
  cursor: pointer;
}
</style>

