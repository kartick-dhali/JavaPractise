package BtechSem5java;

public class JavaException1 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Always run finally block");
        }
    }
}
