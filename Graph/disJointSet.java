import java.util.*;
public class disJointSet {
    public static int find(int par[], int x) {
        if (x == par[x])
            return x;
        return par[x] = find(par, par[x]);
    }

    public static void union(int a, int b, int par[], int rank[]) {
        int parA = find(par, a);
        int parB = find(par, b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int par[] = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        int rank[] = new int[n];
        System.out.println(find(par, 3));
        union(1, 3, par, rank);
        System.out.println(find(par, 3));
        union(2, 4, par, rank);
        union(3, 6, par, rank);
        union(1, 4, par, rank);
        System.out.println(find(par, 3));
        System.out.println(find(par, 4));
        union(1, 5, par, rank);

    }
}
