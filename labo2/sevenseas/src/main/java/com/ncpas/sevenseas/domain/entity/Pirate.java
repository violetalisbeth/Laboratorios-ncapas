package com.ncpas.sevenseas.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity
@Table(name = "Pirate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "bounty")
    private Double bounty;

    @Column(name = "crew")
    private String crew;

    @Column(name ="is_alive")
    private Boolean isAlive;

}
