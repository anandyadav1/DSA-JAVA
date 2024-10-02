import java.util.Queue;
import java.util.LinkedList;
public class interLeaveQueue {
    public static void interLeavequeue(Queue<Integer> q) {
        Queue<Integer> fh = new LinkedList<>(); // fh -> firstHalf Queue
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            fh.add(q.remove());
        }

        while (!fh.isEmpty()) {
            q.add(fh.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + "  ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeavequeue(q);

    }
}
