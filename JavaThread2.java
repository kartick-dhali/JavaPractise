package BtechSem5java;

class Multithread implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running.....");
    }

}

public class JavaThread2 {
    public static void main(String[] args) {
        Multithread m = new Multithread();
        Thread t1 = new Thread(m);
        t1.start();
    }
}
