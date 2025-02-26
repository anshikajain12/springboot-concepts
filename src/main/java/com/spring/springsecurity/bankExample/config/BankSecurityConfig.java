package com.spring.springsecurity.bankExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BankSecurityConfig {

    @Bean
    //configure multiple user to access our application.
    //we have customise user details so we cannot access it appication properties
    public InMemoryUserDetailsManager inMemoryUsers() {
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("raj")
                .password("raj@123")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("john")
                .password("john@123")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public SecurityFilterChain security(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(req -> {
                    req.requestMatchers("/home")
                            .permitAll()
                            .anyRequest()
                            .authenticated();
                })
                .httpBasic(Customizer.withDefaults()) // for postman request
                .formLogin(Customizer.withDefaults()); //for browser
        return http.build();
    }
}
