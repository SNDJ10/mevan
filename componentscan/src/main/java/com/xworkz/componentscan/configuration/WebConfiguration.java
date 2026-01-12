package com.xworkz.componentscan.configuration;

import com.xworkz.componentscan.dto.ComponentDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.xworkz.componentscan")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is configuration class");
    }
    @Bean
    public ComponentDTO componentDTO(){
        System.out.println("this is parent class");
        return new ComponentDTO();
    }
}
