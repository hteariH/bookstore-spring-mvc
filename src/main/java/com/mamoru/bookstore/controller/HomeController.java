package com.mamoru.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * user: alekseyb
 * date: 30.05.18
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/myAccount")
    public String myAccount(){
        return "myAccount";
    }
}
