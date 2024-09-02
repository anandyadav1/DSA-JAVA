import java.util.Scanner;

public class largestString {
    public static void compare(String str[]){
        String largest = str[0];
        for(int i=1; i< str.length; i++){
            if(largest.compareTo(str[i])<0){
                largest =str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits []= {"apple", "mango", "banana", "sdjfjghjs", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        compare(fruits);
    }
}
