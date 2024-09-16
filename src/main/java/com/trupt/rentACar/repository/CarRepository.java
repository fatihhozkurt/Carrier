package com.trupt.rentACar.repository;

import java.util.UUID;

import com.trupt.rentACar.entity.CarEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, UUID> {
}
