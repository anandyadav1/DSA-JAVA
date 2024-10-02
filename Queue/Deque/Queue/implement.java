import java.util.LinkedList;
import java.util.Deque;


public class implement {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        //push operations
        public void add(int data){
            dq.addLast(data);
        }

        //remove operations
        public int remove(){
            if(dq.isEmpty()){
                System.out.println("Stack is Empty :");
                return -1;
            }
            return dq.removeFirst();
        }

        //peek operations
        public int peek(){
            if(dq.isEmpty()){
                System.out.println("Element is not avalable because stack is a Empty :");
                return -1;
            }
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(4);
        s.add(5);
        s.add(9);
        s.add(34);
        System.out.println(s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.peek());
    }
    
}

