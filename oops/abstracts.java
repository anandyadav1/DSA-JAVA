import java.util.*;
abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void walk(){
        System.out.println("Animal walking");
    }
    abstract void eat();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Call by Haorse");
    }
    void eat(){
        System.out.println("Eating Horse");
    }
}
public class abstracts {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        System.out.println(h.color);
        h.color="Black";
        System.out.println(h.color);
    }
}
