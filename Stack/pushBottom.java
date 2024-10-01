import java.util.Stack;

public class pushBottom {
    public static int size;
    public static void pushBottomData(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottomData(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottomData(4, s);
        int i=0;
       while (!s.isEmpty()) {
        ++i;
        System.out.println(s.pop() + " "+ i);
       }

    }
}
