import java.util.*;

public class sort {
    public static void main(String[] args) {
        int a[]={3,5,2,67,55,33,56,89,87,67,53};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i=0,j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i++]=a[j];
            a[j--]=t;
        }
        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(5,7,8));
        System.out.println(l);
        System.out.println(Arrays.toString(a));

    }
}
