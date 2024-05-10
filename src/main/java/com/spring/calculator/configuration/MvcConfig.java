package com.spring.calculator.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/calculator").setViewName("calculator");
        registry.addViewController("/calculate").setViewName("calculate");
        registry.addViewController("/number").setViewName("number");
        registry.addViewController("/numbers").setViewName("numbers");
        registry.addViewController("/refresh").setViewName("refresh");
    }
}

// TODO: Validacija registruojant nauja vartojoja paziet email ir username ar nera db,
//  parodyti prisijungisi varda ir role,
//  validacij neigiamiem skaiciam,
//  valdijacija operacijai vesti tik simboli (kaip updeitini)
