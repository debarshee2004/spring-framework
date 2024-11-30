package com.debarshee.springMVC.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home page was requested...");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String result(HttpServletRequest req) {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int sum = i+j;

        HttpSession session = req.getSession();
        session.setAttribute("sum", sum);

        System.out.println("Result was requested...");
        return "result.jsp";
    }
}
