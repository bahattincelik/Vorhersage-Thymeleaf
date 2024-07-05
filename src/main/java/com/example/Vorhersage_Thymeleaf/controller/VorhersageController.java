package com.example.Vorhersage_Thymeleaf.controller;

import com.example.Vorhersage_Thymeleaf.model.Vorhersage;
import com.example.Vorhersage_Thymeleaf.repository.VorhersageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class VorhersageController {

    @Autowired
    VorhersageService vorhersageService;

    @GetMapping("/")
    String getVorhersageForm(Model model){

        model.addAttribute("vorhersage", new Vorhersage());
        return "index";
    }

    @PostMapping("/getVorhersage")
    ModelAndView getVorhersage(@ModelAttribute Vorhersage vorhersage, Model model){
        Random random=new Random();
        int rand=random.nextInt(51);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("vorhersage", vorhersage);
        modelAndView.addObject("result", vorhersageService.geschlosseneVorhersage(vorhersage,rand));
        modelAndView.addObject("randVal", rand );
        return modelAndView;
    }
}
