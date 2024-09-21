public class findLastOccurence {
    public static int findlastOccurenceElement(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = findlastOccurenceElement(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {

            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 1, 8, 4, 6, 4, 4, 5, 6, 9, 1, 3, 1, 3, 3, 1, 1, 1, 1, 1, 1 };
        System.out.println(arr.length);
        System.out.println(findlastOccurenceElement(arr, 1, 0));
    }

}
