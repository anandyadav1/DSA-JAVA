
public class sudoku {

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // Base case: if we have reached beyond last row, solution is found
        if(row == 9){
            return true;
        }

        // Compute next cell
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;

        // If current cell is already filled, move to next cell
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing numbers 1-9
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0; // backtrack
            }
        }

        return false; // no digit fits here
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        // Check column
        for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        // Check row
        for(int j=0; j<9; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // Check 3x3 box
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i= startRow; i< startRow+3; i++){
            for(int j= startCol; j< startCol+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] + " ");
                if(j==2 || j==5) System.out.print("  ");
            }
            System.out.println();
            if(i==2 || i==5)System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},

            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},

            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

