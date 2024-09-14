package BtechSem5java;

//super keyword always point to the parent class
class ParentClass {
    int a;

    ParentClass(int x) {
        a = x;
    }
}

class ChildClass extends ParentClass {
    int b;

    ChildClass(int x, int y) {
        super(x);
        b = y;
    }

    void show() {
        System.out.println("Value of a is " + super.a + "\nvalue of b is: " + b);
    }
}

public class ConstructorOrderOfExecution1 {
    public static void main(String[] args) {
        ChildClass c = new ChildClass(100, 50);
        c.show();
    }
}
