
public class implimentations {
    public static class Queue {

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        static int arr[];
        static int size;
        static int rear;

        // Empty funtions
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add funtions
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is the Empty");
                return;
            }
            arr[++rear] = data;
        }

        // remove funtions
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            return front;
        }

        // peek funtions
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(31);
        // q.add(32);
        // q.add(33);
        // q.add(34);
        // q.add(39);
        // q.add(38);
        System.out.println(q.peek());

    }
}
