package com.spring.calculator.config;

import com.spring.calculator.CalculatorApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CalculatorApplication.class);
    }
}

// TODO:
//      1. grizus i login galima grizt atgal i calculator
//      2. skaiciavimu paieska
//      3. back migtukas
