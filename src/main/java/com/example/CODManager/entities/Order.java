package com.example.CODManager.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idOrder;
    private int amountProduct;
    private Date dateOrder;
    private Enum<StatusOrder> statusOrder;
    private String remark;

    @ManyToOne
    private Product product ;

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "order")
    private Delivery delivery;
}

 enum StatusOrder{

    CONFIRME,
    ANNULE,
     HORS_ZONE,
     PAS_REPONSE,
     SMS,
     LANCE

}