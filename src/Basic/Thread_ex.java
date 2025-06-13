package Basic;

public class Thread_ex extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread_ex t = new Thread_ex();
        t.start();

        try {
            Thread.sleep(5000); // Correct usage
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");
    }
}
