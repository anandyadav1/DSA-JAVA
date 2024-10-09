
// import java.util.HashMap;
import java.util.*;

public class majeorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 5, 4, 7, 4, 8, 1, 4, 1, 7, 1, 7, 1, 8, 2, 1, 9, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        // if(map.containsKey(arr[i])){
        // map.put(arr[i], map.get(arr[i])+1);
        // }else{
        // map.put(arr[i], 1);
        // }
        // }

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> keySet = new map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }

        // for (Integer key : map.keySet()) {
        // if (map.get(key) > arr.length / 3) {
        // System.out.println(key);
        // }
        // }
    }
}
