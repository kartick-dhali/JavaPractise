package BtechSem5java;

public class JavaException2 {
    public static void main(String[] args) {
        try {
            // int x = 10 / 0;
            // String s = null;
            // System.out.println(s.length()); // null pointer exception
            int a[] = new int[5];
            a[10] = 20; // ArrayOutOfBoundException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
