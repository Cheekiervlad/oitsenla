package aab.senla.test.service;

import aab.senla.test.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    Order create(Order origin);
    List<Order> getByPeriodOrderedByUserIdThenByCreatedAt(LocalDateTime since, LocalDateTime until);
}
