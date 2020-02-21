package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

        @GetMapping("/")
        public String saludito(){
            return "Hola";
        }

        @GetMapping("/suma") //Porque es un metodo get
        public double suma(@RequestParam(value = "numA") double a,
                           @RequestParam(value = "numB") double b){
            return a+b;
        }
        @GetMapping("/resta")
        public double resta(@RequestParam(value = "numA") double a,
                            @RequestParam(value = "numB") double b){
            return a-b;
        }
        @GetMapping("/multiplicar")
        public double multiplicar(@RequestParam(value = "numA") double a,
                                  @RequestParam(value = "numB") double b){
            return a*b;
        }
        @GetMapping("/division")
        public double division(@RequestParam(value = "numA") double a,
                               @RequestParam(value = "numB") double b){
            return a/b;
        }
        @GetMapping("/cuadrado")
        public double cuadrado(@RequestParam(value = "numA") double a){
        return a*a;
    }
        @GetMapping("/porcentaje")
        public double porcentaje(@RequestParam(value = "numA") double a,
                           @RequestParam(value = "numB") double b){
        return a*(b/100);
    }


    }
