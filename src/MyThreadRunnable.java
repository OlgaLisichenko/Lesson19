public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName());
    }
}
