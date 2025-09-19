import java.util.*;
public class alienDictionary {

    public static boolean dfs(ArrayList<Integer> graph[], int src, int vis[], Stack<Integer> st){
        vis[src]=1;
        for(int dest:graph[src]){
            if(vis[dest]==1) return true;
            if(vis[dest]==0 && dfs(graph,dest,vis,st)) return true;
        }
        vis[src]=2;
        st.push(src);
        return false;
    }

    public static String findOrder(String dict[],int N, int V){
        ArrayList<Integer> graph[]=new ArrayList[V];
        for(int i=0; i<V; i++) graph[i]=new ArrayList<>();
        for(int i=0; i<N-1; i++){
            String word1=dict[i];
            String word2=dict[i+1];
            int len=Math.min(word1.length(),word2.length());
            for(int j=0; j<len; j++){
                if(word1.charAt(j)!=word2.charAt(j)){
                    int src=word1.charAt(j)-'a';
                    int dest=word2.charAt(j)-'a';
                    graph[src].add(dest);
                    break;
                }
            }
        }

        int vis[]=new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<V; i++){
            if(vis[i]==0){
                if(dfs(graph,i,vis,st)) return "";
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append((char)(st.pop()+'a'));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // Questions
        /*
        Given a sorted dictionary of an alien language having N words and K starting
        alphabets of a standard dictionary. Find the order of characters in the alien
        language
        There may be multiple valid orders for a particular test case, thus you may
        return any valid order as a string. The output will be True if the order
        returned by the function is correct, else False denoting an incorrect order.
        If the given arrangement of words is inconsistent with any possible letter
        ordering, return an empty string "".
        */

        int V= 4;
        String dict[] = {"baa","abcd","abca","cab","cad"};                   //Output: b d a c
        int N = 5;
        //Explanation:
        //We will analyze every consecutive pair to find out the order of the characters.
        //The pair “baa” and “abcd” suggests ‘b’ appears before ‘a’ in the alien dictionary.
        //The pair “abcd” and “abca” suggests ‘d’ appears before ‘a’ in the alien dictionary.
        //The pair “abca” and “cab” suggests ‘a’ appears before ‘c’ in the alien dictionary.
        //The pair “cab” and “cad” suggests ‘b’ appears before ‘d’ in the alien dictionary.
        //So, [‘b’, ‘d’, ‘a’, ‘c’] is a valid ordering.


        // int V= 3;
        // String dict[] = {"caa","aaa","aab"};            //Output: c a b
        // int N = 3;
        //Explanation: Similarly, if we analyze the consecutive pair
        //for this example, we will figure out [‘c’, ‘a’, ‘b’] is  a valid ordering.

        String ans =findOrder(dict, N, V);
        System.out.println(ans);
    }
}
