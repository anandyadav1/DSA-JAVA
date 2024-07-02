public class PrefixSubArray {

    public static void printbyPrifix(int numbers[]){
        int max= Integer.MIN_VALUE;
        int currentSum= 0;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        System.out.println("This is a prefix array :");
        for(int n : prefix){
            System.out.print(n + "  ");
        }
        System.out.println();


        System.out.println("This is maximum sum :");
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
               int end =j;

               currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];    //start = i;  end = j

               if(currentSum >= max){
                max =currentSum;
               }
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int numbers[] = {3, 2, 4, -5};
        // int numbers[] = {2, 4, 5, -7, 8, -9, 5, -12, -21};
        printbyPrifix(numbers);
    }
}
