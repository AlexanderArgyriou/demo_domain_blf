package com.example.demo.inhouse.domain.concrete.accessories;

import com.example.demo.inhouse.domain.mappedsuper.Accessory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "VF_PRODUCT")
public class Headphones extends Accessory {
    private String headPhoneAttr;
}
