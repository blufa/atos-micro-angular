package atos.sn.cvservice.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@OpenAPIDefinition
@Configuration
public class SpringFoxConfig implements WebMvcConfigurer {
    @Bean
    public OpenAPI baseOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Cv service").
                version("2.0.0").
                description("Cv Microservices"));
    }

}