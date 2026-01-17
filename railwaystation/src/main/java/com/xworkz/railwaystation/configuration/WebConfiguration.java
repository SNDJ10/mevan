package com.xworkz.railwaystation.configuration;

import com.xworkz.railwaystation.dto.RailwayDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.railwaystation")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is WebConfiguration");
    }
    @Bean
public RailwayDTO railwayDTO(){
    System.out.println("this is railway dto");
    return railwayDTO();
}
@Autowired
public  void RailWayController(){
    System.out.println("this is RailWayController");
}
@Value("railway")
public void railway(){
    System.out.println("this is railway");
}
}
