package com.debarshee.springMVC.controller;

import com.debarshee.springMVC.model.AlienModel;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute
    public void ModelAtt(Model model) {
        model.addAttribute("name", "Debarshee");
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home page was requested...");
        return "index";
    }

    @RequestMapping("addAlien")
    public String addAlien(
//            @RequestParam("alien_id") int alien_id,
//            @RequestParam("alien_name") String alien_name,
            @ModelAttribute("alien") AlienModel alienModel
//            Model model
    ) {
//        AlienModel alienModel = new AlienModel();
//        alienModel.setAlien_id(alien_id);
//        alienModel.setAlien_name(alien_name);

//        model.addAttribute("alien", alienModel);

        System.out.println("Alien Object was requested...");

        return "result";
    }

    @RequestMapping("add")
    public ModelAndView add(
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
