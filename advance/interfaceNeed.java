package advance;

interface Computer {
    void code();
}

class Desktop implements Computer {

    public void code() {
        System.out.println("writing a code with desktop");
    }
}

class Laptop implements Computer {

    public void code() {
        System.out.println("writing code with Laptop");
    }
}

class Developer {

    public void devApp(Computer lap) {
        lap.code();
    }
}

public class interfaceNeed {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer obj = new Developer();
        obj.devApp(desk);
    }
}
