package com.samsung;

public class Car {
    String model;
    int wheels;
    int power;

    Car(String mymodel, int mywheels, int mypower) {
        //System.out.println("Hello");
        model = mymodel;
        wheels = mywheels;
        power = mypower;
    }

    void startEngine() {

    }

    double leftFuel() {
        return 1.0;
    }

    void printInfo() {
        System.out.print("Model: " + model);
        System.out.print("\tWheels: " + wheels); //\t TAB \n new ln
        System.out.println("\tPower: " + power);
    }

    void modify(Car anotherCar) {
        wheels = anotherCar.wheels;
        power = anotherCar.power;
    }

    @Override
    public String toString() {
        return ("SMT");
    }
}

