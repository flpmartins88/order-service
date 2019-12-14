package io.github.felipe.order.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public class Order {

    @Id
    private Long id;

    private String customerName;

    protected Order() {}

    public Order(Long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public Order(String customerName) {
        this(null, customerName);
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
