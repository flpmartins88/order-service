package io.github.felipe.order.rest;

import io.github.felipe.order.domain.Item;
import io.github.felipe.order.domain.ItemRepository;
import io.github.felipe.order.rest.request.ItemRequest;
import io.github.felipe.order.rest.response.ItemResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders/{order}/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Flux<ItemResponse> findAll(@PathVariable String order) {
        return itemRepository.findAllByOrder(order)
                .map(ItemResponse::from);
    }

    @PostMapping
    public Mono<ItemResponse> save(@PathVariable Integer order, @RequestBody ItemRequest item) {
        return itemRepository.save(item.toDomain(order))
                .map(ItemResponse::from);
    }

}
