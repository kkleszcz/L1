package com.example;

public class Truck extends Vehicle {
    private double loadCapacity;
    
    public double getLoadCapacity(){
        return loadCapacity;
    }

    Truck(String n, double m, double l, double h, double lC){
        super(n, m, l, h);
        loadCapacity = lC;
    }
}
