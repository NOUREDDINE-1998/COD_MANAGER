package com.example.CODManager.services;

import com.example.CODManager.entities.Delivery;
import com.example.CODManager.entities.User;

import java.util.List;

public interface DeliveryService {

    List<Delivery> getDeliveries();
    Delivery getDelivery(Long deliveryId);
    Delivery createDelivery(Delivery delivery);
    Delivery updateDelivery(Long deliveryId, Delivery delivery);
    void deleteDelivery(Long deliveryId);

}
