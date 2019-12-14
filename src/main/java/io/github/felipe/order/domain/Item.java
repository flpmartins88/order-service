package io.github.felipe.order.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("items")
public class Item {

    @Id
    private Integer id;

    private Integer order;

    private String name;
    private Integer quantity;
    private Long value;

    protected Item() {}

    public Item(Integer order, String name, Integer quantity, Long value) {
        this.order = order;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOrder() {
        return order;
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
