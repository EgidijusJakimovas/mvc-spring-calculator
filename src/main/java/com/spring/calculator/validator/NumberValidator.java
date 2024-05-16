package com.spring.calculator.validator;

import com.spring.calculator.model.Number;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class NumberValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Number.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Number number = (Number) o;

        if (number.getNumber1() < 0) {
            errors.rejectValue("number1", "Negative.numberForm.number1");
        }

        if (number.getNumber2() < 0) {
            errors.rejectValue("number2", "Negative.numberForm.number2");
        }
    }
}
