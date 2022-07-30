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
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client extends User{

    @OneToMany(mappedBy="client",/*fetch = FetchType.EAGER,*/cascade = CascadeType.ALL)
    private Collection<Order> orders=new ArrayList<>();



}
