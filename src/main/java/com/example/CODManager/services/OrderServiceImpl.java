package com.example.CODManager.services;

import com.example.CODManager.entities.Order;
import com.example.CODManager.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long orderId, Order order) {
        Order currentOrder=this.getOrder(orderId);

        currentOrder.setAmountProduct(order.getAmountProduct());
        currentOrder.setDateOrder(order.getDateOrder());
        currentOrder.setStatusOrder(order.getStatusOrder());
        currentOrder.setClient(order.getClient());
        currentOrder.setRemark(order.getRemark());
        currentOrder.setProduct(order.getProduct());

        return orderRepository.save(currentOrder);
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
