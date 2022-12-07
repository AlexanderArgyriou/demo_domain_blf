package com.example.demo.inhouse.domain.repos;

import com.example.demo.inhouse.domain.concrete.devices.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartPhoneRepo extends JpaRepository<SmartPhone, Long> {
}
