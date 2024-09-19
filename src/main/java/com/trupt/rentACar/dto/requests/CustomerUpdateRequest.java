package com.trupt.rentACar.dto.requests;

public record CustomerUpdateRequest(
    String name,

    String surname,

    String ssid,

    String email,

    String phone,

    String country,

    String city,

    String fullAddress,

    String password
) {
}
