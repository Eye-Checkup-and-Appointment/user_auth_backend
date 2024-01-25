package com.achyuth.user_authentication.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() { final String securitySchemeName =
            "bearerAuth";

        return new OpenAPI().info(getInfo()); }


    private Info getInfo() {
        final String apiTitle = "Test Gradle App";
        final String description = "Just a test app";
        return new Info().title(apiTitle).description(description).version("1.0.0").contact(getContact());
    }

    private Contact getContact() {
        return new Contact().name("Achyuth Vama").email("achyuth.varma1@gmail.com");
    }

}
