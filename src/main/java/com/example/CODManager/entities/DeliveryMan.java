package com.example.CODManager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class DeliveryMan extends User{

    @OneToMany(mappedBy = "deliveryMan")
    private Collection<Delivery> deliveries = new ArrayList<>();

    @ManyToOne
    private City city;
}
