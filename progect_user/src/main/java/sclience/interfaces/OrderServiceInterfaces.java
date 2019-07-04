package sclience.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sclience.entity.Order;

import java.util.List;

@FeignClient("ORDER")
public interface OrderServiceInterfaces {


    @RequestMapping("/order/findAllOrdersByUserId")
    List<Order> findAllOrdersByUserId(@RequestParam("userId") String userId);
}
