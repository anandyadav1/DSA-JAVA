class Vehical {
    void maintainse(){
        System.out.println("Complete maintenance");
    }
    void print(){
        System.out.println("Base class");
    }
}

class Car extends Vehical {
    void speed() {
        System.out.println("140 km/h");
    }
    void print(){
        System.out.println("Derived class");
    }
}

public class check {
    public static void main(String[] args) {
        // Car c = new Vehical();  //not allow
        Vehical v = new Car();  //allow
        v.maintainse();
        v.print();      //isame derived class print hoga using overriding
        // v.speed();   //ye error dega
    }
}
