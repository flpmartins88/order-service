package io.github.felipe.order.rest.response;

import io.github.felipe.order.domain.Item;

public class ItemResponse {

    private final Integer id;

    private final String name;
    private final Integer quantity;
    private final Long value;

    public ItemResponse(Integer id, String name, Integer quantity, Long value) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Long getValue() {
        return value;
    }

    public static ItemResponse from(Item item) {
        return new ItemResponse(item.getId(), item.getName(), item.getQuantity(), item.getValue());
    }
}
