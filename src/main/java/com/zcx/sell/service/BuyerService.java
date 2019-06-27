package com.zcx.sell.service;

import com.zcx.sell.dto.OrderDTO;

/**
 * @author zoucaoxin
 * @date 2019/6/27 - 22:58
 * @description 买家
 */
public interface BuyerService {

    /**
     * 查询一个订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
