package com.HostelManagement.Springboot.hostelManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("greet")
    public String greet(){
        return "app/greet";
    }
}
