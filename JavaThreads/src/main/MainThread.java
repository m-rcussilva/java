package main;

public class MainThread {
    public static void main(String[] args) {

        System.out.println("How many threads are active? " + Thread.activeCount());

        Thread mainThread = Thread.currentThread();
        System.out.println("Thread name: " + mainThread.getName());
        System.out.println("Is alive? " + mainThread.isAlive());
        System.out.println("main thread priority is: " + mainThread.getPriority());
        System.out.println();

        for (int i = 3; i > 0; i--) {
            System.out.println("Inicio do programa");
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Fim do programa");
            System.out.println();
        }
        System.out.println();

        // Call the Second Thread
        SecondThread secondThread = new SecondThread();
        secondThread.start();

        System.out.println("Second Thread name: " + secondThread.getName());
        System.out.println("Second Thread priority: " + secondThread.getPriority());
        System.out.println("How many threads are active? " + Thread.activeCount());
        System.out.println("Is alive? " + secondThread.isAlive());

    }
}
