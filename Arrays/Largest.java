public class Largest {
    public static int largestNumber(int numbers[], int m){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {34, 45, 66, 2, 56, 2334, 66, 787 ,344, 565};
        int m= numbers.length;
        System.out.println(largestNumber(numbers,m));
        
    }
}
