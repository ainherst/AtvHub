package com.example.ATVHub.atv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//(path = "api/v1/Atv")
@Controller
public class AtvHomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}