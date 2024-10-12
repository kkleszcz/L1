package com.example;

public class Car extends Vehicle{
    private int passengerCapacity;

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    Car(String n, double m, double l, double h, int pC){
        super(n, m, l, h);
        passengerCapacity = pC;
    }
}
