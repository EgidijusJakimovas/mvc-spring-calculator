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
//      1. vientisas stilius (visoms formoms bendras footeris, headeris ir menu). Menu juostoje varotojas mato prisijungimo
//      varda ir gali atsijungti. Menu juostuoje yra nuorodos i formas (skaiciuoti, perziureti, atnaujinti)
//      2. kai bus sutvarkyta vartotojo validacija identiskai sutvarkyti number validator
//      5. pabandyti mvc config paliekant kontroleryje