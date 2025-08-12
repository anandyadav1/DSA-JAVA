public class kadanes {
    public static int max(int a[]){
        int n=a.length;
        int sum=a[0], max=a[0];
        for(int i=1; i<n; i++){
            sum=Math.max(a[i], sum+a[i]);
            max=Math.max(max, sum);
        }
        return max;
    }
    public static int min(int a[]){
        int n=a.length;
        int min=a[0];
        int sum=a[0];
        for(int i=1; i<n; i++){
            sum=Math.min(a[i], sum+a[i]);
            min=Math.min(min, sum);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max sum of SubArrays : "+max(arr));
        System.out.println("Min sum of SubArrays : "+min(arr));
    }
}
