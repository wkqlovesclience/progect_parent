package sclience.dao;

import sclience.entity.Order;

import java.util.List;

public interface OrderDao {
    /**
     * 根据用户ID获取该用户所有订单
     */
    List<Order> findAllOrdersByUserId(String userId);
}
