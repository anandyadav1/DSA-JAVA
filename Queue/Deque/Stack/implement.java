import java.util.LinkedList;
import java.util.Deque;


public class implement {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        //push operations
        public void push(int data){
            dq.addLast(data);
        }

        //remove operations
        public int pop(){
            return dq.removeLast();
        }

        //peek operations
        public int peek(){
            return dq.getLast();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(9);
        s.push(34);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
    
}
