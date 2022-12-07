package com.example.demo.inhouse.domain.mappedsuper;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
@Getter
@Setter
@MappedSuperclass
public class Tangible extends JpaVfgProduct {
    private String tangibleProp;
}
