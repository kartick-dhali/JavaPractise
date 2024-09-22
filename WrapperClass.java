public class WrapperClass {
    public static void main(String[] args) {
        int x = 123;
        // autoboxing
        Integer xauto = x;
        System.out.println(x);
        System.out.println(xauto instanceof Integer);

        // unboxing

        int y=xauto;
        System.out.println(y);
    }
}
