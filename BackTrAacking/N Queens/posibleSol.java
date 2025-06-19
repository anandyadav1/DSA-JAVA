import java.util.*;
//all posible solution by checking to the atack by Queen


public class posibleSol {

public static void nQueen(char board[][], int row) {
    if (row == board.length) {
        if (count ==1) {
            printBoard(board);
            return;
        }
        count ++;
        return;
    }
    // column loop
    for (int j = 0; j < board.length; j++) {
        if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            nQueen(board, row + 1); // function call
            board[row][j] = 'X'; // Backttracking step
        }
    }

}

    public static boolean isSafe(char board[][], int row, int col) {
        // check for vertical up or move
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check for diagonaly left move
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check for diagonaly right move
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }

        return true;

    }


    public static void printBoard(char board[][]) {
        System.out.println("______chess board______");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static int count =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for N * N Matrix :");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        // initlize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueen(board, 0);
        System.out.println("\nAll posible solutions for N*N Queens \n" + count);

    }
}
