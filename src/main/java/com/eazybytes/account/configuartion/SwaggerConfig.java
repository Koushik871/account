package com.eazybytes.account.configuartion;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public-api") // Optional: name your API group for identification in Swagger UI
                .pathsToMatch("/**") // Matches all paths in your application
                .build();
    }

//    @Bean
//    public io.swagger.v3.oas.models.OpenAPI customOpenAPI() {
//        return new io.swagger.v3.oas.models.OpenAPI()
//                .info(new Info().title("Spring Boot API")
//                        .description("Sample API with Springdoc OpenAPI")
//                        .version("v1.0"));
//    }
}

