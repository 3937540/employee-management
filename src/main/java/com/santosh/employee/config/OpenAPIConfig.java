package com.santosh.employee.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl("http://localhost:8081");
        prodServer.setDescription("Server URL in Production environment");

        Contact contact = new Contact();
        contact.setEmail("k.santoshdash@gmail.com");
        contact.setName("Santosh Kumar Dash");
        contact.setUrl("https://www.bezkoder.com");

        Info info = new Info()
                .title("Employee Management API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage employees.")
                .termsOfService("https://www.bezkoder.com/terms");

        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
    }
}
