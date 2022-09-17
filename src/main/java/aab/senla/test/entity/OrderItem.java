package aab.senla.test.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer id;
    private Product product;
    private int quantity;
}
