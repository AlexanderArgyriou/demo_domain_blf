package com.example.demo.controllers;

import com.example.demo.inhouse.domain.concrete.devices.SmartPhone;
import com.example.demo.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class DummyController {
    private final SmartPhoneService smartPhoneService;

    @Autowired
    public DummyController(SmartPhoneService smartPhoneService) {
        this.smartPhoneService = smartPhoneService;
    }

    @GetMapping
    public SmartPhone getSmartphone(@RequestParam Long id) {
        return smartPhoneService.getByID(id);
    }
}
