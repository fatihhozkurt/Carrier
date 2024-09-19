package com.trupt.rentACar.mapper;

import java.util.List;

import com.trupt.rentACar.entity.CarEntity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  List<CarEntity> toEntityList(List<>);


}
