package com.example.demo.external.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "BLC_PRODUCT")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@ToString
public class JpaProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jpaProductProp;
}
