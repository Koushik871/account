package com.eazybytes.account.configuartion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.cert.Extension;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{

        http
                .authorizeHttpRequests(authorize ->
                        authorize
                                .requestMatchers("/", "/home").permitAll() // Allow access to these endpoints without authentication
                                .anyRequest().authenticated() // Require authentication for all other endpoints
                )
                .httpBasic(withDefaults());




//        http.
//                authorizeHttpRequests(
//                        authorizeHttpRequests-> authorizeHttpRequests.
//                                requestMatchers("/","/home")
//                                .permitAll().
//                                        anyRequest().
//                                                authenticated()).
//                formLogin(
//                        formLogin->
//                                formLogin.loginPage("/login").permitAll()).
//                logout(LogoutConfigurer::permitAll);


        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
        userDetailsService.createUser(User.withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build());



        return userDetailsService;
    }
    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
}
