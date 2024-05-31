package com.example.demo;


import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;



@Configuration
@RequiredArgsConstructor
public class keycloakManager {

    @Bean
    public Keycloak keycloak() {
        return KeycloakBuilder.builder()
                .serverUrl("http://172.29.208.1:7080/auth")
                .realm("master")
                .clientId("my-admin-app")
                .username("dayed")
                .password("admin")
                .build();
    }
}


