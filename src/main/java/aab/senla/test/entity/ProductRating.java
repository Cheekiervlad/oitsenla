package aab.senla.test.entity;

import lombok.Data;

@Data
public class ProductRating {
    private Product product;
    private int ordersCount;
}
