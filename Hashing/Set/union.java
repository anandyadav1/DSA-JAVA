import java.util.HashSet;
import java.util.Set;

public class union {
    public static void allunion(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){

            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        while (!set.isEmpty()) {
            set.remove(set)
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 5, 2, 6, 7, 1 };
        int arr2[] = { 8, 4, 3, 9, 5, 2 };
        allunion(arr1, arr2);
    }
}
