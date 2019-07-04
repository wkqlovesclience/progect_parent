package sclience.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sclience.entity.Order;
import sclience.entity.User;
import sclience.interfaces.OrderServiceInterfaces;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrderServiceInterfaces orderServiceInterfaces;
    @RequestMapping("findAll")
    public List<User> findAll(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1","xiaohei",1,23));
        users.add(new User("2","xiaohei2",2,23));
        users.add(new User("3","xiaohei3",1,23));
        return users;
    }
    //查询所有订单
    @RequestMapping("findAllOrders")
    public List<Order> findAllOrders(String userId){

//        String forObject = restTemplate.getForObject("http://ORDER/order/findAllOrdersByUserId?userId=" + userId, String.class);
//        List<Order> orders = JSONObject.parseArray(forObject, Order.class);
        List<Order> orders = orderServiceInterfaces.findAllOrdersByUserId(userId);
        return orders;
    }
}
