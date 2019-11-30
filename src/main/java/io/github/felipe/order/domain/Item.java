package io.github.felipe.order.domain;

import java.util.UUID;
import org.springframework.data.annotation.Id;

public class Item {

    @Id
    private String id = UUID.randomUUID().toString();

    private String order;

    private String name;
    private Integer quantity;
    private Long value;

    protected Item() {}

    public Item(String order, String name, Integer quantity, Long value) {
        this.order = order;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
