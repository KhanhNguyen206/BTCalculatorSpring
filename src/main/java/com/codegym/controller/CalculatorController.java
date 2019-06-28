package com.codegym.controller;

import com.codegym.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public ModelAndView goHome(){
        ModelAndView modelAndView= new ModelAndView("index", "calculator", new Calculator());
        return modelAndView;
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@ModelAttribute("calculator")Calculator calculator){
        Integer result = calculator.calculate();
        ModelAndView modelAndView = new ModelAndView("view", "result", result);
        return modelAndView;
    }
}
