public class Kadanes {
    public static void kadanesAlgorithm(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSum1 = Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            currentSum += numbers[i];

            if(currentSum < 0){
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("This is the maxisum : ");
        System.out.println( maxSum);
    }
    public static void main(String[] args) {
        // int numbers[] = {-5, -8, -9, -3, -4, -8, -16};
        int numbers[] = {5, -8, 9, -3, 4, 8, -16};

        kadanesAlgorithm(numbers);

    }
}
