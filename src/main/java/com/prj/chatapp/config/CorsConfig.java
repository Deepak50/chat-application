//package com.prj.chatapp.config;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Collections.singletonList("http://localhost:3000")); // Specify the allowed origin
//        configuration.setAllowedHeaders(Arrays.asList("Origin", "X-Api-Key", "X-Requested-With", "Content-Type", "Accept", "Authorization")); // Specify the allowed headers
//        configuration.setAllowedMethods(Arrays.asList("GET","POST", "OPTIONS")); // Specify the allowed HTTP methods (e.g., GET, POST)
//        configuration.setAllowCredentials(true);
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration); // Apply this configuration to all paths
//
//        return source;
//    }
//}