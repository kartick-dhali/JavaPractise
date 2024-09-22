class OuterClass {
    int x = 10;

    // static outer class ->we don't need to create an object of outer class to call
    // inner class
    static class InnerClass {
        int y = 15;
    }
}

public class JavaInnerClas1 {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        System.out.println(inner.y);
    }
}
