package io.github.felipe.order.rest;

import io.github.felipe.order.domain.Order;
import io.github.felipe.order.domain.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public Flux<Order> listOrders() {
        return this.orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Order> findById(@PathVariable String id) {
        return this.orderRepository.findById(id);
    }

}
