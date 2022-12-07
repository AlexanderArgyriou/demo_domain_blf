package com.example.demo.inhouse.domain.concrete.accessories;

import com.example.demo.inhouse.domain.mappedsuper.Accessory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "VF_PRODUCT")
public class Keyboard extends Accessory {
    private String keyboardAttr;
}