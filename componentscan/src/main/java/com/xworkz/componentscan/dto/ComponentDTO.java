package com.xworkz.componentscan.dto;

public class ComponentDTO {
    public int price;
    public String name;
    public int id;

    public  ComponentDTO(int price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;

    }
    public ComponentDTO(){
        System.out.println("this is component Dto");
    }


}
