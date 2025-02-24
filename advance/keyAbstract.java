package advance;

abstract class Car {

    public abstract void drive();

    public void seater() {
        System.err.println("Our car is 4 wheeler");
    }
}

class WagnaR extends Car {

    public void drive() {
        System.out.println("drive");
    }
}

public class keyAbstract {

    public static void main(String[] args) {
        Car obj = new WagnaR();
        obj.seater();
        obj.drive();
    }
}
