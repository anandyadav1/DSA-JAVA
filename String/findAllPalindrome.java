import java.util.*;
public class findAllPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        Set<String> palindromes = allPalindromicSubstrings(s);
        List<String> sortedPalindromes = new ArrayList<>(palindromes);
        Collections.sort(sortedPalindromes, Comparator.comparingInt(String::length).reversed());

        System.out.println(sortedPalindromes);
    }

    static Set<String> allPalindromicSubstrings(String s) {
        Set<String> result = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandAroundCenter(s, i, i, result); // odd length
            count += expandAroundCenter(s, i, i + 1, result); // even length
        }
        System.out.println("Total palindromic substrings (including duplicates): " + count);
        return result;
    }

    static int expandAroundCenter(String s, int left, int right, Set<String> result) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            count++;
            left--;
            right++;
        }
        return count;
    }
}
