package BtechSem5java;

class Vehicle {
    public void ride() {
        System.out.println("Vehicle is riding");
    }
}

class Bike extends Vehicle {
    public void rideBike() {
        System.out.println("This is bike riding");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.ride();
    }
}
