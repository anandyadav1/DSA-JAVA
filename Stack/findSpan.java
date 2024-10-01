import java.util.Stack;

public class findSpan {
    public static void totalSpan(int stock[], int span[]){
        Stack<Integer> s =new Stack<>();
        for(int i=0; i<stock.length; i++){
            int currPrice=stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevDays=s.peek();
                span[i]=i-prevDays;
            }
            s.push(i);
        }
        for(int sp:span){
            System.out.print(sp+"  ");
        }
    }
    public static void main(String[] args) {
        int stock[]={100, 80, 60, 70, 60, 85, 100};
        int span[]=new int[stock.length];
        totalSpan(stock, span);
    }
}
