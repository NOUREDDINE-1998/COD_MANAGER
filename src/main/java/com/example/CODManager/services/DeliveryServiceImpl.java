package com.example.CODManager.services;

import com.example.CODManager.entities.Delivery;
import com.example.CODManager.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService{
    DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public List<Delivery> getDeliveries() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery getDelivery(Long deliveryId) {
        return deliveryRepository.findById(deliveryId).get();
    }

    @Override
    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery updateDelivery(Long deliveryId, Delivery delivery) {
        Delivery currentDelivery= this.getDelivery(deliveryId);
        currentDelivery.setDateDelivery(delivery.getDateDelivery());
        currentDelivery.setStatusDelivery(delivery.getStatusDelivery());
        currentDelivery.setDeliveryMan(delivery.getDeliveryMan());
        currentDelivery.setOrder(delivery.getOrder());

        return deliveryRepository.save(currentDelivery);
    }

    @Override
    public void deleteDelivery(Long deliveryId) {
        deliveryRepository.deleteById(deliveryId);
    }
}
