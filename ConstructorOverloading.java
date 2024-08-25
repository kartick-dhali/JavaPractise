package BtechSem5java;

public class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("This is a default constructor");
    }

    ConstructorOverloading(String carname) {
        System.out.println("This is a argument constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading("maruti");
    }
}
