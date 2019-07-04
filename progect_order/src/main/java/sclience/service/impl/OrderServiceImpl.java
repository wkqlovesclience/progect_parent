package sclience.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sclience.dao.OrderDao;
import sclience.entity.Order;
import sclience.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Order> findAllOrdersByUserId(String userId) {
        return orderDao.findAllOrdersByUserId(userId);
    }
}
