import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("Anand", 90000);
        hm.put("anand", 10000);
        hm.put("anandkr", 920000);
        System.out.println(hm);
        hm.remove("anand");
        System.out.println(hm);
        System.out.println();

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Anand", 90000);
        lhm.put("anand", 10000);
        lhm.put("anandkr", 920000);
        System.out.println(lhm);
        int m=lhm.get("anand");
        System.out.println(m);
        System.out.println(hm);
        System.out.println();

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("bnand", 90000);
        tm.put("anand", 10000);
        tm.put("anandkr", 920000);
        System.out.println(tm);
        boolean n=tm.containsKey("anand");
        System.out.println(n);

        System.out.println(tm+" "+tm.size());
    }
}
