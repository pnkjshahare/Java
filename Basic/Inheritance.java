
class Cal {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

class AdvCal extends Cal {

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        int val1 = obj.add(10, 20);
        int val2 = obj.sub(10, 20);
        int val3 = obj.multiply(10, 20);
        int val4 = obj.div(10, 20);

        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
    }
}
