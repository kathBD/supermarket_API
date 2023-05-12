package com.marketapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saludar")
public class HolaMUndoController {

@GetMapping("/hola")
    public String saludar(){
        return  "La mejor programadora  ❤️";
    }
}
