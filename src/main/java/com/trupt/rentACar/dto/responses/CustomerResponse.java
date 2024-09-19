package com.trupt.rentACar.dto.responses;

import java.util.List;

import com.trupt.rentACar.entity.PaymentEntity;
import com.trupt.rentACar.entity.RentEntity;

public record CustomerResponse(

    String name,

    String surname,

    String email,

    String phone,

    String country,

    String city,

    String fullAddress,

    String driverLicenseNo,

    List<PaymentEntity> payment,

    List<RentEntity> rent
    ) {
}
