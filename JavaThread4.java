package BtechSem5java;

public class JavaThread4 {
    public static void main(String[] args) {
        // give the detail of the current thread
        Thread t = Thread.currentThread();
        System.out.println("current thread is: " + t);

        t.setName("disha");
        t.setPriority(t.getPriority() - 1);
        System.out.println("modifying thread is: " + t);

    }
}
