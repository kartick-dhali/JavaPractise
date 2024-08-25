package BtechSem5java;

interface HumanEat {
    void eat();
}

interface HumanWalk {
    void walk();
}

class Human implements HumanEat, HumanWalk {

    @Override
    public void walk() {
        System.out.println("Human is walking.");
    }

    @Override
    public void eat() {
        System.out.println("Human is Eating.");
    }

}

public class MultipleInheritence {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
    }
}
