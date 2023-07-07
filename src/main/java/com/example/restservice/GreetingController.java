package com.example.restservice;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/")
    public String alumno(){
        return "A1510250  - DAVID NICOLA";
    }
    @GetMapping(path = "/idat/codigo")
    public String codigo(){
        return "A1510250";
    }

    @GetMapping(path = "/idat/nombre-completo")
    public String nombre(){
        return "DAVID ROLANDO NICOLA TENORIO";
    }

}
