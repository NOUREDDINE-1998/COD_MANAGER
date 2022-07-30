package com.example.CODManager.services;

import com.example.CODManager.entities.Delivery;
import com.example.CODManager.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();
    Order getOrder(Long orderId);
    Order createOrder(Order order);
    Order updateOrder(Long orderId, Order order);
    void deleteOrder(Long orderId);
}
