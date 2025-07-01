import java.util.*;

public class allSubset {
    public static List<List<Integer>> find1(int a[], int idx, List<List<Integer>> res, List<Integer> curr) {
        if (idx == a.length) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        curr.add(a[idx]);
        find1(a, idx + 1, res, curr);
        curr.remove(curr.size() - 1);
        find1(a, idx + 1, res, curr);

        return res;
    }

    public static List<List<Integer>> find2(int a[], int idx, List<List<Integer>> res, List<Integer> curr) {
        res.add(new ArrayList<>(curr));
        for (int i = idx; i < a.length; i++) {
            curr.add(a[i]);
            find2(a, i + 1, res, curr);
            curr.remove(curr.size() - 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3};
        System.out.println(find1(a, 0, new ArrayList<>(), new ArrayList<>()));
        System.out.println(find2(a, 0, new ArrayList<>(), new ArrayList<>()));
    }
}
