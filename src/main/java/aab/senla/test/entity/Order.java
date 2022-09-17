package aab.senla.test.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
public class Order {
    private Integer id;
    private int userId;
    private Collection<OrderItem> items;
    private LocalDateTime createdAt;
}
