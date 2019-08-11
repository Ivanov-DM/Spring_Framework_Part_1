package com.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping(path = "/showResultForm", method = RequestMethod.GET)
    public String showResultForm(@RequestParam int a, int b, Model model) {
        int sum = a + b;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("sum", sum);
        return "result-form";
    }
}
