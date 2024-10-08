import java.util.HashMap;

public class anagram {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        // return map.isEmpty();
        return true;
    }
    public static void main(String[] args) {
        String s="care";
        String t="race";
        System.out.println(isAnagram(s, t));
    }
}
