package com.example.demo;

@RestController
public class HelloWorld {
	
	@GetMapping(
	path = "/hello",
	produces = "text/plain")
	
	public String getHelloWorld()
	{
		return "Hello Wooorld !";
	}
}	
