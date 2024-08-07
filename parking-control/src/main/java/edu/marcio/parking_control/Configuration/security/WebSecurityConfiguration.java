package edu.marcio.parking_control.Configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
    @Autowired
    HttpSecurity httpSecurity;
    @Autowired
    private UserDetailServiceImplementation userDetailServiceImplementation;

    @Bean
    protected void authenticationManager()  throws Exception{
        
        httpSecurity.getSharedObject(AuthenticationManagerBuilder.class).userDetailsService(userDetailServiceImplementation).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
