package com.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormsController {

    @RequestMapping("/showSimpleForm")
    public String showSimpleForm() {
        return "myform";
    }

    @RequestMapping(path = "/processForm", method = RequestMethod.GET)
    public String processForm() {
        return "myform-result";
    }

//    @RequestMapping(path = "/advProcessForm", method = RequestMethod.GET)
//    public String advProcessForm(HttpServletRequest request, Model model) {
//        String student = request.getParameter("studentName");
//        student = student + " - Strudent";
//        model.addAttribute("attrStudent", student);
//        return "myform-result-adv";
//    }

    @RequestMapping(path = "/advProcessForm", method = RequestMethod.GET)
    public String advProcessForm(@RequestParam("studentName") String student, Model model) {
        student = student + " - Strudent";
        model.addAttribute("attrStudent", student);
        return "myform-result-adv";
    }
}
