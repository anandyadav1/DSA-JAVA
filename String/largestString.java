import java.util.*;

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
        String fruits []= {"apple", "mango", "banana", "sdjfjghjs", "t"};
        Integer a[]={4,5,6,7,8};
        int b[]=new int[a.length];
        for(int i=0; i<a.length; i++) b[i]=a[i];
        Arrays.sort(fruits, Collections.reverseOrder());
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(fruits));
        compare(fruits);
    }
}
