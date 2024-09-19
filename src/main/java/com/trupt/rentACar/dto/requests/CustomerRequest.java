package com.trupt.rentACar.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(

    @NotNull
    @NotBlank
    String name,

    @NotNull
    @NotBlank
    String surname,

    @NotNull
    @NotBlank
    String ssid,

    @NotNull
    @NotBlank
    String email,

    @NotNull
    @NotBlank
    String phone,

    @NotNull
    @NotBlank
    String country,

    @NotNull
    @NotBlank
    String city,

    @NotNull
    @NotBlank
    String fullAddress,

    @NotNull
    @NotBlank
    String password
) {
}
