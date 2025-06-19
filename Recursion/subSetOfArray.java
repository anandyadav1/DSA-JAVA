import java.util.*;

public class subSetOfArray {

    public static List<List<Integer>> findSubSet(int arr[], int idx, List<List<Integer>> ans, List<Integer> list) {
        if (idx == arr.length) {
            ans.add(new ArrayList<>(list));
            return ans;
        }

        list.add(arr[idx]);

        findSubSet(arr, idx + 1, ans, list);
        list.remove(list.size() - 1);

        findSubSet(arr, idx + 1, ans, list);

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> ans = findSubSet(arr, 0, new ArrayList<>(), new ArrayList<>());
        System.out.println(ans);
    }
}
