package com.trupt.rentACar.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "rents")
public class RentEntity extends BaseEntity {

  @Column(name = "totalPrice", nullable = false)
  private double totalPrice;

  @Column(name = "startDate", nullable = false)
  private LocalDate startDate;

  @Column(name = "endDate", nullable = false)
  private LocalDate endDate;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "car_id")
  private CarEntity car;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "payment_id")
  private PaymentEntity payment;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "lessor_id")
  private LessorEntity lessor;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_id")
  private CustomerEntity customer;
}