package io.github.felipe.order.rest.request;

import javax.validation.constraints.NotBlank;

public class OrderRequest {

    @NotBlank
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
