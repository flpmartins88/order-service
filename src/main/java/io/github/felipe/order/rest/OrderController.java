package io.github.felipe.order.rest;

import io.github.felipe.order.domain.Order;
import io.github.felipe.order.domain.OrderRepository;
import io.github.felipe.order.rest.request.OrderRequest;
import io.github.felipe.order.rest.response.OrderResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{id}")
    public Mono<OrderResponse> findById(@PathVariable String id) {
        return this.orderRepository.findById(id)
                .map(OrderResponse::from);
    }

    @PostMapping
    public Mono<OrderResponse> save(@Valid @RequestBody OrderRequest orderRequest) {
        return orderRepository.persist(new Order(orderRequest.getCustomerName()))
                .map(OrderResponse::from);
    }

    @GetMapping
    public Flux<OrderResponse> listOrders() {
        return this.orderRepository.findAll()
                .map(OrderResponse::from);
    }

}
