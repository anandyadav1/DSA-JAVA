import java.util.ArrayList;

public class operations {

    static class Stack {
        int data;
        ArrayList<Integer> list= new ArrayList<>();
        public boolean isEmpty(){
            return list.size() ==0;
        }

        public void push(int data){
            list.add(data);
    }
    
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack ll =new Stack();
        ll.push(345);
        ll.push(345);
        ll.push(345);
        ll.push(345);
        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}


