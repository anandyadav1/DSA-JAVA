
public class BubbleSort {
    public static void Sorting(int arr[]){

        //For sorting
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean swap = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int  temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap =true;
                }
            }
            if(swap == false){
                break;
            }

        }


        //for Printing array
        for(int arrs : arr){
            System.out.print(arrs + "   ");
        }
    }
    public static void main(String[] args) {
        // int arr[] ={5, 3, 6, 1, 7, 2, 4, 7, 2, 3, 3, 2, 5};
        int arr[] ={1,2,3,4,5,6,7};
        Sorting(arr);
    }
}
;