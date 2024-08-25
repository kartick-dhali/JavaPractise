package BtechSem5java;

interface Player {
    final String name = "katu";
    void printName();
}

class A implements Player {
    public void printName() {
        System.out.println("\nThe name of the palyer is : " + name);
    }
}

public class interfaceMain {
    public static void main(String[] args) {
        A obj = new A();
        obj.printName();
    }
}
