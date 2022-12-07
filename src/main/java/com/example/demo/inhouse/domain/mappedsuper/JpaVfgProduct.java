package com.example.demo.inhouse.domain.mappedsuper;

import com.example.demo.external.domain.JpaProduct;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@ToString(callSuper = true)
public class JpaVfgProduct extends JpaProduct {
    private String seoId;
}
