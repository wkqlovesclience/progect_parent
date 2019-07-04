package sclience.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sclience.entity.Order;
import sclience.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @RequestMapping("findAllOrdersByUserId")
    public List<Order> findAllOrdersByUserId(String userId){
        System.out.println("用户ID："+userId);
        return orderService.findAllOrdersByUserId(userId);
    }
}
