
public class arrayBacktrack {

    public static void backTracking(int arr[], int i, int val){   //i =index
        //Base case
        if(arr.length == i){
            printArr(arr);
            return;
        }

        arr[i]=val;
        backTracking(arr, i+1, val+1);
        arr[i]=arr[i]-3;

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [10];
        backTracking(arr, 0, 1);
        printArr(arr);

    }
}
