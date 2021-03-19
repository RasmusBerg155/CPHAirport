package com.example.demo.Controller;

import com.example.demo.Service.PhaseSimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    PhaseSimService phaseSimService;

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


    @GetMapping("/test_output")
    public String testOutput(Model model){
        model.addAttribute("smallTime", phaseSimService.smallAircraft());
        model.addAttribute("mediumTime", phaseSimService.mediumAircraft());
        model.addAttribute("largeTime", phaseSimService.largeAircraft());
        return "test_output";
    }
}
