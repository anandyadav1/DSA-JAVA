public class subSets {
    public static int c=0;
    public static void subsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 2) {
                c++;
                System.out.println(c+" : "+" null");
            } else {
                c++;
                System.out.println(c+" : "+ans);
            }
            return;
        }

        // Choise

        subsets(str, ans + str.charAt(i), i + 1); // choise for yes

        subsets(str, ans, i + 1); // choise for No

    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "  ", 0);
    }
}
