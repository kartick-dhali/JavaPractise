package BtechSem5java;

class Vehicle {
    String brand = "TATA";

    public void printBrand() {
        System.out.println("\n" + brand);
    }
}

class Car extends Vehicle {
    String modelName = "Altroz";

    public void printModel() {
        System.out.println("\n" + modelName);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.printBrand();
        Car c = new Car();
        c.printBrand();
        c.printModel();
        System.out.println(c.brand);
    }
}