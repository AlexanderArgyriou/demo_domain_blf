package com.example.demo;

import com.example.demo.inhouse.domain.repos.SmartPhoneRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateQueryTest {
    private final SmartPhoneRepo smartPhoneRepo;

    @Autowired
    public HibernateQueryTest(SmartPhoneRepo smartPhoneRepo) {
        this.smartPhoneRepo = smartPhoneRepo;
    }

    @Test
    void loadTest() {
        System.out.println(smartPhoneRepo.findAll());
    }
}
