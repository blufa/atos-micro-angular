package atos.sn.cvservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
public class SpringFoxConfig implements WebMvcConfigurer {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        final String res = "classpath:/META-INF/resources/";

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations(res);

        registry.addResourceHandler("swagger-resources/**")
                .addResourceLocations(res);

        registry.addResourceHandler("v2/api-docs")
                .addResourceLocations(res);

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations(res);
    }
}