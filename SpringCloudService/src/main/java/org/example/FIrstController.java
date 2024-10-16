package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class FIrstController {

    @GetMapping("/message")
    public String test(@RequestHeader Map<String, String> headers) {
        System.out.println("######################################################################");
        headers.forEach((key, value) -> {
            System.out.println("Header: " + key + " Value: " + value);
        });
        System.out.println("######################################################################");
        return "Hello JavaInUse Called in First Service";
    }
}