package io.github.felipe.order.domain;

import reactor.core.publisher.Mono;

public interface OrderRepositoryCustom {

    Mono<Order> persist(Order order);

}
