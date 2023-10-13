import request from '@/utils/request'

// 查询物料列表
export function listWlbgmx(query) {
  return request({
    url: '/erp/wlbgmx/list',
    method: 'get',
    params: query
  })
}

// 查询物料详细
export function getWlbgmx(WLBH) {
  return request({
    url: '/erp/wlbgmx/' + WLBH,
    method: 'get'
  })
}

// 新增物料
export function addWlbgmx(data) {
  return request({
    url: '/erp/wlbgmx',
    method: 'post',
    data: data
  })
}

// 修改物料
export function updateWlbgmx(data) {
  return request({
    url: '/erp/wlbgmx',
    method: 'put',
    data: data
  })
}

// 删除物料
export function delWlbgmx(WLBH) {
  return request({
    url: '/erp/wlbgmx/' + WLBH,
    method: 'delete'
  })
}
