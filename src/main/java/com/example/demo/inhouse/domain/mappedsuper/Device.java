package com.example.demo.inhouse.domain.mappedsuper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
@Getter
@Setter
@MappedSuperclass
@ToString(callSuper = true)
public class Device extends Tangible {
    private String deviceProp;
}
