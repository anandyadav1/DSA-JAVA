public class sortedElement {
    public static boolean isSorted(int arr[], int m, int i){   //i = index
        if(i==m-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr, m, i+1);
         
    }
    public static void main(String[] args) {
        // int arr[] ={3, 5, 2, 6, 8, 3, 6};
        int arr[] ={3, 5, 6, 9, 10};
        int n=arr.length;
        System.out.println(isSorted(arr, n, 0));


    }
}
