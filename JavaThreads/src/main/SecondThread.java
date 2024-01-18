package main;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("The Second Thread is running");

        // Introduce a delay or loop to keep the thread alive for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The Second Thread is done");
    }

}
