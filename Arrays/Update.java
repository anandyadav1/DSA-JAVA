import java.util.*;

public class Update {
    public static void Upddate(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[]= {23, 56, 89};
        for(int mk : marks){
            System.out.print(mk+ " ");
        }
        System.out.println();
        Upddate(marks);
        for(int mark: marks){
            System.out.print(mark+" ");
        }
        System.out.println();

    }
}


