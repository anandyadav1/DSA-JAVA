import java.util.Scanner;

public class alllSolutions {

    public static void nQueen(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueen(board, row + 1); // function call
            board[row][j] = 'X'; // Backttracking step
        }

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

    static int count = 0;

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
        System.out.println("\nAll posible solutions for N*N Queens \n"+count);

    }
}
