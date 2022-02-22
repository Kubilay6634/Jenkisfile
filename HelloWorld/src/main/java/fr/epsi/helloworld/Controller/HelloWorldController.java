/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.helloworld.Controller;

/**
 *
 * @author cetin
 */
@RestController
public class HelloWorldController {
{{{{{{{{{
    @GetMapping(
            path = "/hello",
            produces = "text/plain")
    public String getHelloWorld()
    {
        return "Hello World !";
    }
    
}
