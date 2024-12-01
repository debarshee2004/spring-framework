package com.debarshee.spring_boot_mvc.controller;

import com.debarshee.spring_boot_mvc.model.AlienModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

/**
 * Controller class for handling HTTP requests in the Spring MVC application.
 * This class manages routes for adding Aliens, performing addition operations, and rendering views.
 */
@Controller
public class AlienController {

    /**
     * Adds a global attribute to the model, accessible in all views.
     * This is invoked before any request mapping methods in this controller.
     *
     * @param model the Spring Model object used to add attributes.
     */
    @ModelAttribute
    public void ModelAtt(Model model) {
        model.addAttribute("name", "Debarshee");
    }

    /**
     * Handles requests to the home page.
     *
     * @return the name of the view for the home page (`index`).
     */
    @RequestMapping("/")
    public String home() {
        System.out.println("Home page was requested...");
        return "index";
    }

    /**
     * Handles requests to add an Alien.
     * The `AlienModel` object is populated automatically using @ModelAttribute from form data.
     *
     * @param alienModel the AlienModel object containing form data.
     * @return the name of the view (`result`) to display the result.
     */
    @PostMapping("addAlien")
//  @RequestMapping(value = "addAlien", method = RequestMethod.POST)
    public String addAlien(
            @ModelAttribute("alien") AlienModel alienModel
//          @RequestParam("alien_id") int alien_id,
//          @RequestParam("alien_name") String alien_name,
//          Model model
    ) {
//      AlienModel alienModel = new AlienModel();
//      alienModel.setAlien_id(alien_id);
//      alienModel.setAlien_name("alien", alien_name);

//      model.addAttribute("alien", alienModel);

        System.out.println("Alien Object was requested...");
        return "result";
    }

    /**
     * Handles requests to get Aliens.
     * The `AlienModel` object is populated automatically using @ModelAttribute from form data.
     *
     * @param model the Model object will contain the form data.
     * @return the name of the view (`showAliens`) to display the result.
     */
    @GetMapping("getAliens")
    public String getAliens(Model model)
    {
        List<AlienModel> aliens= Arrays.asList(new AlienModel(101,"Navin"), new AlienModel(102,"Rose"));
        model.addAttribute("result",aliens);

        System.out.println("Get Aliens was requested...");
        return "showAliens";

    }

    /**
     * Handles requests to perform addition of two numbers.
     * The numbers are retrieved from the request parameters, and the result is added to the model.
     *
     * @param i the first number.
     * @param j the second number.
     * @return a ModelAndView object containing the result and view name (`result`).
     */
    @RequestMapping("add")
    public ModelAndView add(
            @RequestParam("num1") int i,
            @RequestParam("num2") int j
//          HttpServletRequest req
//          HttpSession session
    ) {
//      int i = Integer.parseInt(req.getParameter("num1"));
//      int j = Integer.parseInt(req.getParameter("num2"));

        // Create ModelAndView instance
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");

        // Perform the addition
        int sum = i + j;

//      HttpSession session = req.getSession();
//      session.setAttribute("sum", sum);

        // Add the sum to the model
        modelAndView.addObject("sum", sum);

        System.out.println("Result was requested...");

//      return "result.jsp";
        return modelAndView;
    }
}
