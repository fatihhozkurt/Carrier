package com.trupt.rentACar.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Table(name = "lessors")
public class LessorEntity extends BasePersonEntity{

  @OneToMany(mappedBy = "lessor", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CarEntity> car;

  @OneToMany(mappedBy = "lessor", cascade = CascadeType.ALL)
  private List<RentEntity> rent;
}
