package com.trupt.rentACar.dto.responses;

import java.time.Year;
import java.util.List;

import com.trupt.rentACar.entity.ImageEntity;
import com.trupt.rentACar.entity.LessorEntity;
import com.trupt.rentACar.entity.RentEntity;

public record CarResponse(

    String brand,

    String model,

    Year year,

    double mileage,

    double dailyPrice,

    LessorEntity lessor,

    List<ImageEntity> images,

    RentEntity rent
) {
}
