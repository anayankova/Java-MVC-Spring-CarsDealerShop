package com.carsdealershop.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

   //@RequestMapping(value = "/home", method = RequestMethod.GET)
   //public ModelAndView home() {
   //    ModelAndView modelAndView = new ModelAndView();
   //    modelAndView.addObject("msg", "HELLO");
   //    modelAndView.setViewName("home");
   //    return modelAndView;
   //}

   //@RequestMapping(value = "/home", method = RequestMethod.POST)
   //public ModelAndView homeConfirm() {
   //    ModelAndView modelAndView = new ModelAndView();
   //    modelAndView.setViewName("home");
   //    return modelAndView;
   //}

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "HELLO");
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
