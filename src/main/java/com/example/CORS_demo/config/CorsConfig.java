package com.example.CORS_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry corsRegistry){

                corsRegistry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("POST", "GET")
//                        .allowedHeaders("header1", "header2", "header3")
                        .allowCredentials(false)
                        .maxAge(3);
            }
        };
    }

}

