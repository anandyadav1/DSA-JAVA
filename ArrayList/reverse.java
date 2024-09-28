import java.util.ArrayList;

public class reverse {
public static void printReverse(ArrayList<Integer> list){
    int n=list.size();
    for(int i=n-1; i>=0; i--){
        System.out.print(list.get(i)+"  ");
    }
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<= 10; i++){
            list.add(i*3);
        }
        System.out.print(list+"  ");
        System.out.println();
        printReverse(list);
    }
}
