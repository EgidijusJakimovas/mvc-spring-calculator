package com.spring.calculator.controller;

import com.spring.calculator.model.Number;
import com.spring.calculator.service.NumberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class CalculatorController {

    @Autowired
    @Qualifier("NumberService")
    public NumberService numberService;

    @RequestMapping(method = RequestMethod.GET, value = "/calculator")
    public String home(Model model) {
        model.addAttribute("number", new Number());
        return "calculator";
    }

    @PostMapping("/calculate")
    String calculate(@Valid @ModelAttribute("number") Number number, BindingResult br,
                     @RequestParam HashMap<String, String> numbers, ModelMap modelMap) {
        if (br.hasErrors()) {
            return "calculator";
        } else {
            int number1 = Integer.parseInt(numbers.get("number1"));
            int number2 = Integer.parseInt(numbers.get("number2"));
            String operation = numbers.get("operation");

            System.out.println("Results: " + numbers.entrySet());
            int result = switch (operation) {
                case "+" -> number1 + number2;
                case "-" -> number1 - number2;
                case "*" -> number1 * number2;
                case "/" -> number1 / number2;
                default -> 0;
            };

            modelMap.put("number1", number1);
            modelMap.put("number2", number2);
            modelMap.put("operation", operation);
            modelMap.put("result", result);

            numberService.save(new Number(number1, number2, operation, result));

            return "calculate";
        }
    }

    @GetMapping("/numbers")
    public String getAllNumbers(Model model) {
        model.addAttribute("numbers", numberService.getAll());
        return "numbers";
    }

    @GetMapping("/view{id}")
    public String getById(@RequestParam("id") int id, Model model) {
        model.addAttribute("number", numberService.getById(id));
        return "number";
    }

    @GetMapping("/delete{id}")
    public String delete(@RequestParam("id") int id, Model model) {
        numberService.delete(id);
        model.addAttribute("numbers", numberService.getAll());
        return "numbers";
    }

    @GetMapping("/refresh{id}")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("number", numberService.getById(id));
        return "refresh";
    }

    @PostMapping("/refreshNumber")
    public String updateNumber(@ModelAttribute("number") Number number) {
        numberService.update(number);
        return "redirect:/refreshNumber?id=" + number.getId();
    }
}
