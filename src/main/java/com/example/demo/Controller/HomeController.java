package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/work_group")
    public String workGroup(){
        return "work_group";
    }

    @GetMapping("/admin_group")
    public String adminGroup(){
        return "admin_group";
    }
}
