class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 15;
    }
}

public class JavaInnerClas {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        System.out.println(out.x);

        OuterClass.InnerClass inner = out.new InnerClass();
        System.out.println(inner.y);
    }
}
