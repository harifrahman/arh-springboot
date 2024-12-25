package arh.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/greet")
    public String greetWithPost(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
