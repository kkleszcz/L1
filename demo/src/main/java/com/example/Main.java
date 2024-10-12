package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String l = "";
        while(!l.equals("quit")){
            l = "";
            System.out.println("add - a || list - l || quit - q");
            l = System.console().readLine();
            if(l.equals("a")){
                try {
                    Vehicle v = new Vehicle();
                    double mass, height, length, lC;
                    int pC;

                    System.out.println("Vehicle type: Car - c || Truck - t");
                    String type = System.console().readLine();
                    if(!type.equals("c") && !type.equals("t")) throw new Exception("Wrong car type");
                    System.out.println("Name: ");
                    String name = System.console().readLine();

                    System.out.println("Mass: ");
                    mass = Double.parseDouble(System.console().readLine());
                    System.out.println("Height: ");
                    height = Double.parseDouble(System.console().readLine());
                    System.out.println("Length: ");
                    length = Double.parseDouble(System.console().readLine());

                    if(type.equals("c")) {
                        System.out.println("Passenger capacity: ");
                        pC = Integer.parseInt(System.console().readLine());
                        v = new Car(name, mass, length, height, pC);
                    }
                    if(type.equals("t")){
                        System.out.println("Load capacity: ");
                        lC = Double.parseDouble(System.console().readLine());
                        v = new Truck(name, mass, length, height, lC);
                    }
                    vehicles.add(v);

                } catch (NumberFormatException e) {
                    System.out.println("Wrong number format");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(l.equals("l")) {
                System.out.println("==================");
                for(int i = 0; i < vehicles.size(); i++){
                    Vehicle v = vehicles.get(i);
                    String c = v.getClass().getSimpleName();
                    System.out.println("ID: " + i);
                    System.out.println("Type: " + c);
                    System.out.println("Name: " + v.getName());
                    System.out.println("Mass: " + v.getMass());
                    System.out.println("Length: " + v.getLength());
                    System.out.println("Height: " + v.getHeight());
                    
                    if(c.equals("Car")) System.out.println("Passenger capacity: " + ((Car) v).getPassengerCapacity());
                    if(c.equals("Truck")) System.out.println("Load capacity: " + ((Truck) v).getLoadCapacity());

                    System.out.println("==================");
                }
            }
        }
            
    }
}