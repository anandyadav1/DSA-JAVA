interface  Cheshboard{
    abstract void move();
}
class Queen implements Cheshboard{
    public void move(){
        System.out.println("UP, DOUN, RIGHT, LEFT, Diagonal (in all directions)");
    }
}
class King implements Cheshboard{
    public void move(){
        System.out.println("UP, DOUN, RIGHT, LEFT (only one move)");
    }
}
// class Rook implements Cheshboard{
//     void move(){
//         System.out.println("UP, DOUN, RIGHT, LEFT (in four directions)");
//     }
// }
// class Camel implements Cheshboard{
//     void move(){
//         System.out.println("Diagonaly (in four directions)");
//     }
// }
public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        King k = new King();
        q.move();
        k.move();
        // Rook r = new Rook();
        // Camel c = new Camel();


    }
}
