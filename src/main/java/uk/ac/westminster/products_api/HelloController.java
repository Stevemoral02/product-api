package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/hello")

    public String hello() {
        return "hello from spring boot";
    }

    @GetMapping("/status")

    public String status() {
        return "Spring boot status completed";
    }

    @GetMapping("/goodbye")

    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }
}
