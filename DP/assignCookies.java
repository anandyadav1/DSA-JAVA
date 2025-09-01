import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an array greed[], where greed[i] represents the minimum size of
         * cookie required to satisfy the i-th child, and an array cookie[], where
         * cookie[j] represents the size of the j-th cookie. Each child can receive at
         * most one cookie. A child i will be satisfied if they receive a cookie j such
         * that cookie[j] >= greed[i]. Your task is to determine the maximum number of
         * children that can be satisfied.
         */

        int greed[] = {1, 10, 3};
        int cookie[] = {1, 2, 3};    //Output: 2   Explanation: We can only assign cookie to the first and third child.
        // int greed[] = {10,100};
        // int cookie[] = {1, 2};    //Output: 0   Explanation: We can not assign cookies to any child.

        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i = 0, j = 0;
        while(i < greed.length && j < cookie.length){
            if(cookie[j] >= greed[i]){
                i++;
            }
            j++;
        }
        System.out.println(i);
    }
}
