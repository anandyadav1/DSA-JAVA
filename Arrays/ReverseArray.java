public class ReverseArray {
    public static int Reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
        System.out.println(end);

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;
        }
        return 0;
    }
    public static void main(String[] args) {
        int numbers[] = {34, 67, 43, 23, 563, 78, 454,};
        
        System.out.println("Before reverse array :");
        for(int arr : numbers){
            System.out.print(arr+ "   ");
        }
        System.out.println("\n");
        System.out.println("After  reverse array :");
        Reverse(numbers);
        for(int arr : numbers){
            System.out.print(arr+ "   ");
        }
    }
}
