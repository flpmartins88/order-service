package io.github.felipe.order.rest.request;

import io.github.felipe.order.domain.Item;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ItemRequest {

    @NotBlank
    private String name;

    @Min(1)
    private Integer quantity;

    @Min(1)
    private Long value;

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

    public Item toDomain(Integer order) {
        return new Item(order, name, quantity, value);
    }
}
