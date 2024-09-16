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
@Table(name = "customers")
public class CustomerEntity extends BasePersonEntity{

  @Column(name = "license", nullable = false, unique = true, length = 20)
  private String driverLicenseNo;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
  private List<PaymentEntity> payment;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
  private List<RentEntity> rent;
}
