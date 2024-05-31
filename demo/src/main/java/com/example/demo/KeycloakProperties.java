package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "app.config.keycloak")
public class KeycloakProperties {

    private String realm;
    private String url;
    private String clientId;
    private String username;
    private String password;

}