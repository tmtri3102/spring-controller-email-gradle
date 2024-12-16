package com.example.springcontrollercurrenttime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @RequestMapping("demo")
    public String demo(@RequestParam("your-name-is") String name) {
        System.out.println("Hello " + name);
        return "index";
    }
    // http://localhost:8080/demo?your-name-is=MinhTri
    // Hello MinhTri
    // @RequestParam ko co () thi mac dinh la ?name=...
    // kieu nhu getParameter
}
