import java.util.Scanner;

public class palindromes {
    public static boolean check(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the any word for String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));

    }
}
