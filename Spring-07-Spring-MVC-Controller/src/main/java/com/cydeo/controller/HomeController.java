package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller stereotype annotaion
@Controller
public class HomeController {

    //@RequestMapping to associate the action with an HTTP request with
    @RequestMapping ("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping ("/welcome")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping ("/")
    public String welcome2(){
        return "welcome.html";
    }




}
