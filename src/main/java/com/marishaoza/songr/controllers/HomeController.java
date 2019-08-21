package com.marishaoza.songr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/hello")
        // Example: http://localhost:8080/hello?name=Marisha
    public String getHello(@RequestParam(required = false, defaultValue = "world") String name, Model m) {
        m.addAttribute("fName", name);
        return "hello";
    }

    @GetMapping("/capitalize/{someStuff}")
        // Example: http://localhost:8080/capitalize/this%20is%20now%20in%20caps
    public String capitalizePathVar(@PathVariable String someStuff, Model m) {
        m.addAttribute("someStuff", someStuff.toUpperCase());
        return "capitalizePathVar";
    }

    @GetMapping("/reverse")
        // Example: http://localhost:8080/reverse?param=lets%20reverse%20it%20all
    public String reverseQuery(@RequestParam String param, Model m) {
        param = reverseText(param);
        m.addAttribute("reverse", param);
        return "reverseQuery";
    }

    public static String reverseText(String text) {
        String[] splitWords = text.split(" ");
        for ( int i = 0; i < splitWords.length / 2; i++ ) {
            String temp = splitWords[i];
            int mirrorLocation = splitWords.length - 1 - i;
            splitWords[i] = splitWords[mirrorLocation];
            splitWords[mirrorLocation] = temp;
        }
        return String.join(" ", splitWords);
    }

}
