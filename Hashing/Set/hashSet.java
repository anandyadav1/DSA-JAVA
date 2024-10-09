import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(35533);
        hs.add(5533);
        hs.add(95533);
        hs.add(545233);
        hs.add(34533);
        hs.add(67863);
        System.out.println(hs);
        System.out.println();



        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(35533);
        lhs.add(5533);
        lhs.add(95533);
        lhs.add(545233);
        lhs.add(34533);
        lhs.add(67863);
        System.out.println(lhs);
        System.out.println();


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(35);
        ts.add(55);
        ts.add(95);
        ts.add(543);
        ts.add(34);
        ts.add(6);
        System.out.println(ts);
    }
}
