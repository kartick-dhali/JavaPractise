package BtechSem5java;

//order of execution for single level
class ParentClass {
    ParentClass() {
        System.out.println("This is a parent class constructor");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("This is child class constructor");
    }
}

public class ConstructorOrderOfExecution {
    public static void main(String[] args) {
        System.out.println("Order of Execution.....");
        ChildClass c = new ChildClass();
        // creating child class object

    }
}
