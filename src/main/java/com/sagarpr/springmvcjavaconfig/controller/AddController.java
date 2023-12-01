package com.sagarpr.springmvcjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @PostMapping("add")
    public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j ){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Result",i+j);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
