import java.util.*;
public class _2_word_Ladder {
    public static ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList) {
        Set<String> set = new HashSet<>(Arrays.asList(wordList));
        set.remove(startWord);
        Queue<ArrayList<String>> queue = new LinkedList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add(startWord);
        queue.add(list);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<String> usedWord = new ArrayList<>();
            while (size-- > 0) {
                ArrayList<String> res = queue.poll();
                String word = res.get(res.size() - 1);
                if (word.equals(targetWord)) {
                    ans.add(new ArrayList<>(res));
                }
                char[] charArray = word.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    char orignalChar = charArray[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        charArray[i] = c;
                        String nextWord = String.valueOf(charArray);
                        if (set.contains(nextWord)) {
                            res.add(nextWord);
                            usedWord.add(nextWord);
                            queue.add(new ArrayList<>(res));
                            res.remove(res.size() - 1);
                        }
                    }
                    charArray[i] = orignalChar;
                }
            }
            for (String w : usedWord)
                set.remove(w);
            if (ans.size() != 0)
                break;
        }

        return ans;
    }
    public static void main(String[] args) {
        // String startWord = "der", targetWord = "dfs", wordList[] = {"des","der","dfr","dgt","dfs"};
        String startWord = "hit", targetWord = "cog", wordList[] = {"hot","dot","dog","lot","log","cog"};

        ArrayList<ArrayList<String>> res =findSequences(startWord,targetWord,wordList);
        for(ArrayList<String> list : res){
            System.out.println(list);
        }
    }
}
