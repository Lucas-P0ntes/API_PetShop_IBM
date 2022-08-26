package com.example.atividadeibm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @GetMapping("")
    public ModelAndView HOme(){

        return new ModelAndView("redirect:"+ "https://github.com/Lucas-P0ntes/Atividade-aula-gama");
    }

}
