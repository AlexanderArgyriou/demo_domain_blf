package com.example.demo.external.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "BLC_PRODUCT")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class JpaProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jpaProductProp;
}
