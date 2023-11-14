import request from '@/utils/request'

// 查询销售订单列表
export function listXsdd(query) {
  return request({
    url: '/erp/xsdd/list',
    method: 'get',
    params: query
  })
}

// 查询销售订单详细
export function getXsdd(xsddDdls) {
  return request({
    url: '/erp/xsdd/' + xsddDdls,
    method: 'get'
  })
}

// 新增销售订单
export function addXsdd(data) {
  return request({
    url: '/erp/xsdd',
    method: 'post',
    data: data
  })
}

// 修改销售订单
export function updateXsdd(data) {
  return request({
    url: '/erp/xsdd',
    method: 'put',
    data: data
  })
}

// 删除销售订单
export function delXsdd(xsddDdls) {
  return request({
    url: '/erp/xsdd/' + xsddDdls,
    method: 'delete'
  })
}
