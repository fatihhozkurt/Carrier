package com.trupt.rentACar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BasePersonEntity extends BaseEntity{

  @Column(name = "name", nullable = false, length = 32)
  private String name;

  @Column(name = "surname", nullable = false, length = 32)
  private String surname;

  @Column(name = "ssid", nullable = false, unique = true, length = 32)
  private String ssid;

  @Column(name = "email", nullable = false, unique = true, length = 50)
  private String email;

  @Column(name = "phone", nullable = false, unique = true, length = 13)
  private String phone;

  @Column(name = "country",nullable = false)
  private String country;

  @Column(name = "city",nullable = false)
  private String city;

  @Column(name = "full_address", columnDefinition = "TEXT")
  private String fullAddress;

  @Column(name = "password", columnDefinition = "VARCHAR(255)", nullable = false)
  @Size(min = 8, max = 16, message = "Password must be between 8 and 60 characters long")
  private String password;
}