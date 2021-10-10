package com.samsung;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Subaru", 100, 4);
        //myCar.model = "Subaru";
        //myCar.power = 100;
        //myCar.wheels = 4;
        double fuel = myCar.leftFuel();
        myCar.startEngine();
        System.out.println(myCar);

        Car myNewCar = new Car("Bike", 2, 45);

        //myNewCar.wheels = 2;
        //myNewCar.model = "Bike";

        System.out.println(myNewCar.wheels);

        myCar.modify(myNewCar);
        myCar.printInfo();
    }
}
