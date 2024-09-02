public class friquency {
    static void count(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int count [] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int w : count){
            System.out.print(w+ "  ");
        }


    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 21, 34, 25, 3, 5, 2, 3, 8, 5, 3, 5};
        count(arr);
    }
}
