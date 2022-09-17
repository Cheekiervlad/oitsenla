package aab.senla.test.service.impl;

import aab.senla.test.dao.OrderDao;
import aab.senla.test.entity.Order;
import aab.senla.test.service.OrderService;

import java.time.LocalDateTime;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order create(Order origin) {
        return null;
    }

    @Override
    public List<Order> getByPeriodOrderedByUserIdThenByCreatedAt(LocalDateTime since, LocalDateTime until) {
        return null;
    }
}
