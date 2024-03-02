package com.datm.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:4200") // Add your frontend origin here
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Add allowed methods
            .allowCredentials(true); // Allow credentials if needed
    }
}
