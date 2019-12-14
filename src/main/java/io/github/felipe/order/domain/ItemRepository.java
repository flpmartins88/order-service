package io.github.felipe.order.domain;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {

    // Apenas pelo método ainda não funciona
    @Query("SELECT i FROM Item i WHERE i.order = :order")
    Flux<Item> findAllByOrder(String order);

}
