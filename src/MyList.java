import java.util.List;

public class MyList extends MyThread {

    private final List<Integer> list;

    public MyList(List<Integer> list) {
        super(list);
        this.list = list;
    }
}
