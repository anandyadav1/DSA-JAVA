import java.util.Scanner;

public class sortestPath {

    public static float sortPath(String str) {
        int X = 0;
        int Y = 0;
        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);
            if (direction == 'W') {
                X--;
            } else if (direction == 'E') {
                X++;
            }
            else if (direction == 'N') {
                Y++;
            } else {
                Y--;
            }
        }
        int X_squire = X * X;
        int Y_squire = Y * Y;
        return  (float)Math.sqrt(X_squire + Y_squire);
    }

    public static void main(String[] args) {
        System.out.println("Enter the any type of the direction only Capital letter");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sortPath(str));

    }
}
