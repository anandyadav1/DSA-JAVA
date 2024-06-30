import java.util.Scanner;

public class BinarySearch {
    public static int Search(int numbers[], int key){
        int start=0;
        int end= numbers.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            } else if(numbers[mid] < key){
                start = mid+1;
            } else{
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 4, 5, 7, 8, 12, 34, 56, 78, 80};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key for searchin:");
        int key = sc.nextInt();

        System.out.println("That keys is belongs to the index number : "+Search(numbers, key));
    }
}
