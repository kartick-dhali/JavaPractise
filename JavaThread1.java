package BtechSem5java;

class Multithread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class JavaThread1 {
    public static void main(String[] args) {
        Multithread mt = new Multithread();
        mt.start();
    }
}
