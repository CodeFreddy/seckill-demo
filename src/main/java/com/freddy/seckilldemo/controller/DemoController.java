package com.freddy.seckilldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author codefreddy
 * @Date 2020/12/27 23:47
 **/
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "freddy");
        return "hello";
    }
}
