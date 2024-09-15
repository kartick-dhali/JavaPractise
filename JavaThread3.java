package BtechSem5java;

public class JavaThread3 {
    public static void main(String[] args) {
        // creating thread with name
        Thread t1 = new Thread("ThreadName");
        t1.start();
        String name = t1.getName();
        System.out.println(name);
    }
}
