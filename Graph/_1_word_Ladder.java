import java.util.*;
import java.util.LinkedList;
public class _1_word_Ladder {
    public static void changeCharOneByOne(String w, HashMap<String,Boolean> map, Queue<String> q){
        for(int i=0; i<w.length(); i++){
            char word[]=w.toCharArray();
            for(int j=0; j<26; j++){
                char ch=(char)('a'+j);
                if(word[i]==ch) continue;
                word[i]=ch;
                String s=String.valueOf(word);
                if(map.containsKey(s) && !map.get(s)){
                    q.add(s);
                    map.put(s, true);
                }
            }
        }
    }
    public static int solve(String beginWord, String endWord, List<String> wordList){
        HashMap<String,Boolean> map = new HashMap<>();
        for(String s:wordList) map.put(s,false);
        if(!map.containsKey(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int count=1;
        while (!q.isEmpty()) {
            int size=q.size();
            for(int i=0; i<size; i++){
                String word=q.poll();
                if(word.equals(endWord)) return count;
                changeCharOneByOne(word,map,q);
            }
            count++;
        }

        return 0;
    }
    public static void main(String[] args) {
        // Questions
        /*
         * A transformation sequence from word beginWord to word endWord using a
         * dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk
         * such that:
         * Every adjacent pair of words differs by a single letter.
         * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to
         * be in wordList.
         * sk == endWord
         * Given two words, beginWord and endWord, and a dictionary wordList, return the
         * number of words in the shortest transformation sequence from beginWord to
         * endWord, or 0 if no such sequence exists.
         */

        String beginWord = "hit";       //Output: 5
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        //Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", 
        //which is 5 words long.
        int count=solve(beginWord,endWord,wordList);
        System.out.println(count);
    }
}
