public class subSets {
    public static void subsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 2) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Choise

        subsets(str, ans + str.charAt(i), i + 1); // choise for yes

        subsets(str, ans, i + 1); // choise for No

    }

    public static void main(String[] args) {
        String str = "abs";
        subsets(str, "  ", 0);
    }
}
