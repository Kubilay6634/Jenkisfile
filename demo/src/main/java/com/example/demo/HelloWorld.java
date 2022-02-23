package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping(
        path = "/hello",
        produces = "text/plain"
    )
    public String getHelloWorld(){
        return "Hello Woooorrrlldd !";
    }
}	
