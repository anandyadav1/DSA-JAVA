import java.util.Scanner;

public class permutation {

    public static void permutations(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutations(newStr, ans + currChar);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for permutation :");
        String str = sc.next();
        System.out.println("This is the answer of the permutations:");
        permutations(str, " ");

    }
}
