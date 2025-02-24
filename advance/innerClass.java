package advance;

class A {

    public void print() {
        System.out.println("Printing something from class A");
    }

    class B {

        public void writting() {
            System.out.println("writing something from class B");
        }
    }
}

public class innerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        A.B obj1 = obj.new B();
        obj1.writting();
    }
}
