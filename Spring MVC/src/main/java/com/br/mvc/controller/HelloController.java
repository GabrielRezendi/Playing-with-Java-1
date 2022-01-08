package com.br.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("hello")
    public String hello (Model request){
      request.addAttribute("nome", "Mundo");
        return "hello"; //retorna o html no templates com esse nome
    }
}


