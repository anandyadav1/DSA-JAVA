public class insertionSort {
    public static void insertionSot(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding out current positins
            while (prev <= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Inseri\tion
            arr[prev + 1] = arr[prev];
            arr[prev + 1] = curr;
        }

        for(int arrs:arr){
            System.out.println(arrs + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 44, 23, 11, 45, 67 };
        insertionSot(arr);
    }
}
