package com.trupt.rentACar.entity;

import java.time.Year;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "cars")
public class CarEntity extends BaseEntity {

  @Column(name = "brand", nullable = false, length = 50)
  private String brand;

  @Column(name = "model", nullable = false, length = 80)
  private String model;

  @Column(name = "year", nullable = false)
  private Year year;

  @Column(name = "plate", unique = true, nullable = false, length = 9)
  private String plate;

  @Column(name = "mileage", nullable = false)
  private double mileage;

  @Column(name = "dailyPrice", nullable = false)
  private double dailyPrice;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "lessor_id")
  private LessorEntity lessor;

  @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ImageEntity> images;

  @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
  private RentEntity rent;
}