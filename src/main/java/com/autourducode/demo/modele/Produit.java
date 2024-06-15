package com.autourducode.demo.modele;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PRODUIT")
@Getter
@Setter
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 150)
    private String description;
    private double prix;
}
