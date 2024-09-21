public class findFirstOccurence {
    public static int findFirstOccurenceElement(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return findFirstOccurenceElement(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 1, 8, 4, 6, 4, 4, 5, 6, 9, 1, 3, 1, 3, 3, 1, 4, 5, 1};
        System.out.println(findFirstOccurenceElement(arr, 1, 0));
    }
}
