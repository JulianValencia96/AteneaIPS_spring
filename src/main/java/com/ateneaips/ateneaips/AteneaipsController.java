package com.ateneaips.ateneaips;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AteneaipsController {
    @GetMapping("/")

     public String index(){
        return "Hola Mundo from Spring Boot!";
    }
    
      @GetMapping("/ateneaips/{name}")

    public String ateneaips(@PathVariable("name") String name){
        return "Hola "+name+"!!!";
    }

    @GetMapping("/greeting")

    public String greet(@RequestParam("name") String name){
        return "Hola "+name+"!!!";
    }
}
