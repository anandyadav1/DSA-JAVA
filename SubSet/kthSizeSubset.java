
import java.util.*;

public class kthSizeSubset {
    public static List<List<Integer>> find1(int a[], int idx, List<List<Integer>> res, List<Integer> curr, int k) {
        if (idx == a.length) {
            if(k==curr.size()) res.add(new ArrayList<>(curr));
            return res;
        }
        curr.add(a[idx]);
        find1(a, idx + 1, res, curr, k);
        curr.remove(curr.size() - 1);
        find1(a, idx + 1, res, curr, k);

        return res;
    }

    public static List<List<Integer>> find2(int a[], int idx, List<List<Integer>> res, List<Integer> curr, int k) {
        if(k==curr.size()) res.add(new ArrayList<>(curr));
        for (int i = idx; i < a.length; i++) {
            curr.add(a[i]);
            find2(a, i + 1, res, curr, k);
            curr.remove(curr.size() - 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3 ,4, 5};
        System.out.println(find1(a, 0, new ArrayList<>(), new ArrayList<>(), 3));
        System.out.println(find2(a, 0, new ArrayList<>(), new ArrayList<>(), 3));
    }
}

