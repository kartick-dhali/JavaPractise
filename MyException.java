
class CustomMyException extends Exception {
    public CustomMyException(String msg) {
        super(msg);
    }

}

public class MyException {
    public static void main(String[] args) {
        try {
            int a = 40, b = 4;
            if (b == 0)
                throw new CustomMyException("Demonominetor can not be Zero");
            System.out.println(a / b);
        } catch (CustomMyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world");
    }
}
