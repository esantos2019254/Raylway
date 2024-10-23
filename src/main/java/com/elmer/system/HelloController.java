package com.elmer.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/nombre")
    public String getNombre() {
        return "Hola! soy Elmer Santos";
    }
}