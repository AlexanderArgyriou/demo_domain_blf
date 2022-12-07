package com.example.demo.service;

import com.example.demo.inhouse.domain.concrete.devices.SmartPhone;
import com.example.demo.inhouse.domain.repos.SmartPhoneRepo;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneService {
    private final SmartPhoneRepo smartPhoneRepo;

    public SmartPhoneService(SmartPhoneRepo smartPhoneRepo) {
        this.smartPhoneRepo = smartPhoneRepo;
    }

    public SmartPhone getByID(Long id) {
        return smartPhoneRepo.findById(id).get();
    }
}
