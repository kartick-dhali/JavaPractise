package BtechSem5java;

class first implements Runnable {

    Thread t;

    first() {
        t = new Thread(this, "NEW");
        System.out.println("child: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("Existing Child");
        }
    }

}

public class JavaThread5 {

    public static void main(String[] args) throws Exception {
        new first();
        try {

            for (int i = 5; i > 0; i--) {
                System.out.println("Main: " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("Existing main");
        }
    }
}
