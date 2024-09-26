
public class sudoku {
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //Base case
        if(row ==9){
            return true;
        }

        //Recursion
        int nextRows=row, nextCol=col+1;
        if(col+1==9){
            nextRows = row+1;
            nextCol =0;
        }
    }
    public static void main(String[] args) {
        
    }
}
