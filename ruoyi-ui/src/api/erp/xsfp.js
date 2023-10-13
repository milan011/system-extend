import request from '@/utils/request'

// 查询销售发票列表
export function listXsfp(query) {
  return request({
    url: '/system/xsfp/list',
    method: 'get',
    params: query
  })
}

// 查询销售发票详细
export function getXsfp(xsfpFpls) {
  return request({
    url: '/system/xsfp/' + xsfpFpls,
    method: 'get'
  })
}

// 新增销售发票
export function addXsfp(data) {
  return request({
    url: '/system/xsfp',
    method: 'post',
    data: data
  })
}

// 修改销售发票
export function updateXsfp(data) {
  return request({
    url: '/system/xsfp',
    method: 'put',
    data: data
  })
}

// 删除销售发票
export function delXsfp(xsfpFpls) {
  return request({
    url: '/system/xsfp/' + xsfpFpls,
    method: 'delete'
  })
}
