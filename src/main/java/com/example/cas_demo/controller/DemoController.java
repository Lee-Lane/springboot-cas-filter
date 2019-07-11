package com.example.cas_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DemoController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:https://cas.hqzh.mtn/logout?service=https://cas.hqzh.mtn";
    }

}
