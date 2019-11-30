package io.github.felipe.order.domain;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public class Order {

    @Id
    private String id = UUID.randomUUID().toString();

    private String customerName;

    protected Order() {}

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
