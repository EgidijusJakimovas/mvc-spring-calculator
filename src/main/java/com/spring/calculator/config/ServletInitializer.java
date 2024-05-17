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
//      1. Invalid username or password validacija iskelti is HTML
//      2. menu juosta turi buti visur
//      3. menu juosta prilipusi
//      4. prideti footeri visuose endpointuose
//      5. dizainas