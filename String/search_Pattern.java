import java.util.regex.Pattern;

public class search_Pattern {
    public static void main(String[] args) {
        String str="anand kumar yadav anandyadav anand";
        String pat="anan";
        int l=pat.length();
        boolean check=true;
        for(int i=0; i<str.length()-l; i++){
            if(str.substring(i,i+l).equals(pat)){
                check=false;
                System.out.println("Pattern not found at index "+i);
            }
        }
        if(check){
            System.out.println("Pattern not found in index");
        }

    }
}
