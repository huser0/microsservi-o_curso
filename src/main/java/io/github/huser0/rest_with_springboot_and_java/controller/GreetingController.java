package io.github.huser0.rest_with_springboot_and_java.controller;

import io.github.huser0.rest_with_springboot_and_java.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") // ou RequestMapping
    public Greeting greeting(@RequestParam String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
