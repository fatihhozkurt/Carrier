package com.trupt.rentACar.repository;

import java.util.UUID;

import com.trupt.rentACar.entity.CustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
