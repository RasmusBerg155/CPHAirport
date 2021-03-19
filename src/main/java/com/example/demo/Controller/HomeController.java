package com.example.demo.Controller;

import com.example.demo.Model.TaskModel;
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
        TaskModel smallPlan = phaseSimService.smallAircraft();
        TaskModel mediumPlan = phaseSimService.mediumAircraft();
        TaskModel largePlan = phaseSimService.largeAircraft();

        model.addAttribute("smallPlan", smallPlan);
        model.addAttribute("totalSmall", phaseSimService.phaseBoth(smallPlan));

        model.addAttribute("mediumPlan", mediumPlan);
        model.addAttribute("totalMedium", phaseSimService.phaseBoth(mediumPlan));

        model.addAttribute("largePlan", largePlan);
        model.addAttribute("totalLarge", phaseSimService.phaseBoth(largePlan));

        return "test_output";
    }
}
