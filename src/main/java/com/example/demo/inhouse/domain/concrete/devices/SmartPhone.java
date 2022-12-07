package com.example.demo.inhouse.domain.concrete.devices;

import com.example.demo.inhouse.domain.mappedsuper.Device;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "VF_PRODUCT")
public class SmartPhone extends Device {
    private String smartPhoneProp;
}
