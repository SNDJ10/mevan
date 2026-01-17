package com.xworkz.railwaystation.controller;

import org.springframework.stereotype.Controller;





import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class RailWayController {
    public RailWayController(){
        System.out.println("this is controller");
    }
    @GetMapping("/railWayStation")
    public String railWayStation(){
        System.out.println(" this is controller method");
        return "rail.jsp";
}

}