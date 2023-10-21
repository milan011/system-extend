import request from '@/utils/request'

// 查询销售发票列表
export function listXsfp(query) {
  return request({
    url: '/erp/xsfp/list',
    method: 'get',
    params: query
  })
}

// 查询销售发票详细
export function getXsfp(xsfpFpls) {
  return request({
    url: '/erp/xsfp/' + xsfpFpls,
    method: 'get'
  })
}

// 查询销售发票明细
export function getXsfpmx(xsfpFpls) {
  return request({
    url: '/erp/xsfp/mxlist/' + xsfpFpls,
    method: 'get'
  })
}

// 新增销售发票
export function addXsfp(data) {
  return request({
    url: '/erp/xsfp',
    method: 'post',
    data: data
  })
}

// 修改销售发票
export function updateXsfp(data) {
  return request({
    url: '/erp/xsfp',
    method: 'put',
    data: data
  })
}

// 删除销售发票
export function delXsfp(xsfpFpls) {
  return request({
    url: '/erp/xsfp/' + xsfpFpls,
    method: 'delete'
  })
}
