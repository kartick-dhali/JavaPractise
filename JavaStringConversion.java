public class JavaStringConversion {
    public static void main(String[] args) {
        String st = "123";
        // convert string to int
        int num;
        num = Integer.parseInt(st);
        System.out.println("the value using parseint is: " + num);
        num = Integer.valueOf(st);
        System.out.println("the value using parseint is: " + num);

        // convert int to string
        st = Integer.toString(num);
    }
}
