package io.github.felipe.order.rest.response;

import io.github.felipe.order.domain.Order;

public class OrderResponse {

    private final Long id;
    private final String customerName;

    public OrderResponse(Long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static OrderResponse from(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getCustomerName()
        );
    }
}
