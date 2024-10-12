package com.example;

public class Vehicle {
    private double mass = 0;
    private double length = 0;
    private double height = 0;
    private String name = "";

    public double getMass(){
        return mass;
    }
    
    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }
    
    public String getName(){
        return name;
    }

    Vehicle(String n, double m, double l, double h){
        name = n;
        mass = m;
        length = l;
        height = h;
    }
    Vehicle(){}
}
