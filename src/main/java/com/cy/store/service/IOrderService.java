package com.cy.store.service;

import com.cy.store.entity.Order;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /**
     * 创建订单
     * @param aid address_Id
     * @param cids 即将购买的商品数的cart_id
     * @param uid 当前登录的Userid
     * @param username 当前登录的用户名
     * @return 成功创建的订单数据
     */
    Order create(Integer aid, Integer[] cids, Integer uid, String username);
}
