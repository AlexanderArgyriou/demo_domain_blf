package com.example.demo.inhouse.domain.mappedsuper;

import com.example.demo.external.domain.JpaProduct;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class JpaVfgProduct extends JpaProduct {
    private String seoId;
}
