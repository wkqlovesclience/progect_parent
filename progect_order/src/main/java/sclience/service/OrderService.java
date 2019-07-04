package sclience.service;

import sclience.entity.Order;

import java.util.List;

public interface OrderService {
    /**
     * 根据用户ID获取该用户的所有订单
     */
    List<Order> findAllOrdersByUserId(String userId);
}
