public class countingSort {

    public static void countSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];
        for( int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j++]=i;

            }
        }

        for(int print: ){
            System.out.print(print);
        }

    }
    public static void main(String[] args) {
        int arr []={3, 4, 1, 6, 6, 9, 8, 11};
        countSort(arr);
    }
}
