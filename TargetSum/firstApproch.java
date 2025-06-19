import java.util.ArrayList;
//Bigo of (n squre)

public class firstApproch {
    //Brute fource

    public static boolean targetSum(ArrayList<Integer> list, int targetValue){
    for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int sum=list.get(i)+list.get(j);
                if(sum == targetValue){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(24);
        list.add(89);
        list.add(67);
        list.add(12);
        list.add(34);
        list.add(20);
        list.add(7);

        System.out.println(targetSum(list, 19));
    }
}
