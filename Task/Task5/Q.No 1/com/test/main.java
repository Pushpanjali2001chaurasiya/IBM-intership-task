package com.test;

import com.vehicles.Car;
import com.vehicles.Truck;

public class main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Truck truck = new Truck("Ford", "F-150", 1300);

        car.displayDetails();
        truck.displayDetails();
    }
}