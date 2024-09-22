class OuterClass {
    static int x = 10;
    int z = 50;

    // if a static inner class calling non static varibale from outer class
    // it will thorwn an error, outer class varibale must be static
    static class InnerClass {
        int y = 15;

        public int innerMethod() {
            return x;
        }
    }

    // normal inner class can call outer class
    class InnerClass1 {
        public int innerMethod() {
            return z;
        }
    }
}

public class JavaInnerClass2 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass1 inner1 = outer.new InnerClass1();
        System.out.println(inner1.innerMethod());

        OuterClass.InnerClass staticinner = new OuterClass.InnerClass();
        System.out.println(staticinner.innerMethod());
    }
}
