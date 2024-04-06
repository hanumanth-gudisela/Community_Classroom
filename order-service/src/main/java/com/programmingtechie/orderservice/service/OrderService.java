package com.programmingtechie.orderservice.service;

import com.programmingtechie.orderservice.dto.OrderLineItemsDto;
import com.programmingtechie.orderservice.dto.OrderRequest;
import com.programmingtechie.orderservice.model.Order;
import com.programmingtechie.orderservice.model.OrderLineItems;
import com.programmingtechie.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> lineItems = orderRequest.getOrderLineItemsDtoList()
                .stream().map(this::maptoDto)
                .toList();
        order.setOrderLineItemsList(lineItems);
        orderRepository.save(order);
    }

    private OrderLineItems maptoDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems items = new OrderLineItems();
        items.setPrice(orderLineItemsDto.getPrice());
        items.setQuantity(orderLineItemsDto.getQuantity());
        items.setSkuCode(orderLineItemsDto.getSkuCode());
        return items;
    }
}
