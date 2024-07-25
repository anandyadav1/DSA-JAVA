
public class SelectionSort {

    public static void Sorting(int arr[]){
        int n= arr.length;

        for(int i=0; i<n-1; i++){
            int minPos=i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i] = temp;
        }


        //for printing array
        for(int arrs : arr){
            System.out.print(arrs+"  ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 6, 3, 7, 2, 2, 6, 8, 1};
        Sorting(arr);
    }
}
