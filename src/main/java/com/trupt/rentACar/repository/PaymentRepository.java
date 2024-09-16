package com.trupt.rentACar.repository;

import java.util.UUID;

import com.trupt.rentACar.entity.PaymentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, UUID> {
}
