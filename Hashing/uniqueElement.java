import java.util.HashSet;

public class uniqueElement {
    public static void main(String[] args) {
        int arr[] = {4,6,2, 7,8, 4,2, 8,3,5,8,9,6,4,3,2,4};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }

        for(int i=0; i<hs.size(); i++){
            System.out.println(hs.get(arr[i]));
        }

        System.out.println(hs.size());
    }
}
