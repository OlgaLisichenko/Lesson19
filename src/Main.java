import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        task1();
        task3();
    }


    /**
     * 1. Создать три потока Т1, Т2 и Т3.
     * Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1 используя метод join
     */
    private static void task1() throws InterruptedException {
        Thread myThread1 = new Thread(new MyThreadRunnable(), "T1");
        Thread myThread2 = new Thread(new MyThreadRunnable(), "T2");
        Thread myThread3 = new Thread(new MyThreadRunnable(), "T3");

        myThread3.start();
        myThread3.join();
        myThread2.start();
        myThread2.join();
        myThread1.start();
    }

    /**
     * 3. Напишите многопоточный ограниченный буфер с использованием synchronized
     */
    private static void task3() throws InterruptedException {
        List<Integer> listInt = Collections.synchronizedList(new ArrayList<>());
        MyList myThread1 = new MyList(listInt);
        MyList myThread2 = new MyList(listInt);
        MyList myThread3 = new MyList(listInt);

        myThread1.start();
        myThread2.start();
        myThread3.start();

        myThread1.join();
        myThread2.join();
        myThread3.join();

        System.out.println(listInt);
    }
}