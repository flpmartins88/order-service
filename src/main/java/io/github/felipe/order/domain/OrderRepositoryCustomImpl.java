package io.github.felipe.order.domain;

import org.springframework.data.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Mono;

public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

    private final DatabaseClient client;
    //private final R2dbcConverter converter;

    public OrderRepositoryCustomImpl(DatabaseClient client) {
        this.client = client;
        //this.converter = converter;
    }

    @Override
    public Mono<Order> persist(Order order) {
        return client.insert()
                .into(Order.class)
                .table("ORDERS")
                .using(order)
                .map(row -> {
                    order.setId(row.get("id", Long.class));
                    return order;
                })
                .first()
                .switchIfEmpty(Mono.just(order));



    }
}
