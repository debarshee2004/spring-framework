package com.debarshee.springMVC.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home page was requested...");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView result(
//            HttpServletRequest req
            @RequestParam("num1") int i,
            @RequestParam("num2") int j
//            HttpSession session
    ) {
//        int i = Integer.parseInt(req.getParameter("num1"));
//        int j = Integer.parseInt(req.getParameter("num2"));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");

        int sum = i+j;

//        HttpSession session = req.getSession();
//        session.setAttribute("sum", sum);

        modelAndView.addObject("sum", sum);

        System.out.println("Result was requested...");

//        return "result.jsp";
        return modelAndView;
    }
}
