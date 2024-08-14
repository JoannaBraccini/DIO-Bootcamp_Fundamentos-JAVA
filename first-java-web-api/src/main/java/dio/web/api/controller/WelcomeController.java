package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // transforma em um componente rest
public class WelcomeController {
    // mapear os recursos/métodos:
    @GetMapping
    public String welcome() {
        return "Welcome to my Spring Boot Web API";
    }
}
