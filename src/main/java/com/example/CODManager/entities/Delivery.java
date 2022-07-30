package com.example.CODManager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Delivery {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idDelivery;
    private Date dateDelivery;
    private Enum<StatusDelivery> statusDelivery;

    @OneToOne
    private Order order ;

    @ManyToOne
    private DeliveryMan deliveryMan;


}

enum StatusDelivery{

    LIVRE,
    ANNULE,
    REPORTE,
    PAS_REPONSE,


}