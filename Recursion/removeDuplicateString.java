import java.util.Scanner;

public class removeDuplicateString {
    public static void removeDuplicates(String str, StringBuilder newStr, boolean map[], int idx) {
        if (idx == str.length()) {
            System.out.println(newStr);
            System.out.println(idx);
            return;
        }

        char currentChar = str.charAt(idx);

        // Remove Duplicates
        if (map[currentChar - 'a'] == true) {
            removeDuplicates(str, newStr, map, idx + 1);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, newStr.append(currentChar), map, idx + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any type of String for remove of the Duplicates String :");
        //only String not sentences
        String str = sc.next();
        removeDuplicates(str, new StringBuilder(), new boolean[26], 0);
    }
}
