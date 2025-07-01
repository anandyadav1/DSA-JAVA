
import java.util.*;

public class withoutDuplicate {
    public static Set<List<Integer>> find1(int a[], int idx, Set<List<Integer>> set, List<Integer> curr) {
        if (idx == a.length) {
            set.add(new ArrayList<>(curr));
            return set;
        }
        curr.add(a[idx]);
        find1(a, idx + 1, set, curr);
        curr.remove(curr.size() - 1);
        find1(a, idx + 1, set, curr);

        return set;
    }

    public static List<List<Integer>> find2(int a[], int idx, List<List<Integer>> res, List<Integer> curr) {
        res.add(new ArrayList<>(curr));
        for (int i = idx; i < a.length; i++) {
            if(i>idx && a[i]==a[i-1]) continue;
            curr.add(a[i]);
            find2(a, i + 1, res, curr);
            curr.remove(curr.size() - 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 2};
        // System.out.println(find1(a, 0, new ArrayList<>(), new ArrayList<>()));
        // Set<List<Integer>> set =find1(a, 0, new ArrayList<>(), new ArrayList<>());
        // Set<List<Integer>> set = new HashSet<>(set);
        // System.out.println(set);

        //or

        System.out.println(find1(a, 0, new HashSet<>(), new ArrayList<>()));
        System.out.println(find2(a, 0, new ArrayList<>(), new ArrayList<>()));
    }
}
