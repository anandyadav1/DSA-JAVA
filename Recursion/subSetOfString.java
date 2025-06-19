import java.util.*;
public class subSetOfString {

    public static List<String> findSubSet(String str, int idx, List<String> list, StringBuilder sb){
        if(str.length()==idx){
            list.add(sb.toString());
            return list;
        }

        findSubSet(str, idx+1, list, sb.append(str.charAt(idx)));
        sb.deleteCharAt(sb.length()-1);
        findSubSet(str, idx+1, list, sb);

        return list;
    }
    public static void main(String[] args) {
        String str="abc";
        List<String> ans=findSubSet(str,0,new ArrayList<>(), new StringBuilder());
        System.out.println(ans);
    }
}
