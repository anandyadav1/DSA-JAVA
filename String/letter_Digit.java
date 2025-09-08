import java.util.*;

public class letter_Digit {
    public static void main(String[] args) {
        String st = "1ajak2fj3fhd4dfk";
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : st.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum1 += ch - '0';    //Way 1
                sum2 +=Character.getNumericValue(ch);     //Way 2
                sum3 +=Integer.parseInt(String.valueOf(ch));     //Way 3
            } else {
                sb.append(ch);
            }
        }
        char ch[] = sb.toString().toCharArray();
        Arrays.sort(ch);
        sb = new StringBuilder(new String(ch));
        sb.append(sum1);
        System.out.println(sb.toString());
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
