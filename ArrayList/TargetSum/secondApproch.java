import java.util.ArrayList;

public class secondApproch {
    // Time complexity  bigo of(n)

    public static boolean targetSum(ArrayList<Integer> list , int targetValue){
        int lp=0;    //  left pointer
        int rp=list.size()-1;   //right pointer

        while(lp < rp){
            int sum = list.get(lp) + list.get(rp);
            System.out.println(sum);

            if(sum == targetValue){
                return true;
            }

            if(sum < targetValue){
                lp++;
            }else{
                rp--;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(11);
        list.add(12);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(targetSum(list, 27));
        System.out.println(targetSum(list, 19));
        System.out.println(targetSum(list, 37));
        System.out.println(targetSum(list, 98));
    }
}
