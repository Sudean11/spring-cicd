package com.impl.cicd.proj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
    @GetMapping("/api")
    public String dummyApi() {
        return "This is a API endpoint";
    }
}
