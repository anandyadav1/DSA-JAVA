public class SubArrays {
    public static void printSubAraays(int arr[]) {
        int ts = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + "    ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = " + ts);
    }

    public static void printMaxSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currentSum = 0;

                for (int k = i; k < j; k++) {
                    currentSum = currentSum + arr[k];
                }
                System.out.print(currentSum);
                if (currentSum >= max) {
                    max = currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum = "+ max);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, -7, 8, -9, 5, -12, -21};

        printSubAraays(arr);
        printMaxSum(arr);
    }
}
