package aab.senla.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class Product {
    private Integer id;
    private String name;
    private int price;
    private Status status;
    private LocalDateTime createdAt;

    public enum Status {
        OUT_OF_STOCK, IN_STOCK, RUNNING_LOW
    }
}
