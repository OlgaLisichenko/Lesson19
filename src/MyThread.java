import java.util.List;

public class MyThread extends Thread {

    private List<Integer> listInt;

    public MyThread(List<Integer> listInt) {
        this.listInt = listInt;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            listInt.add(i);
        }
    }
}
