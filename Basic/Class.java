// class->keyword
//Class->class name

class calculate {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Class {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        // class_name obj_name=new class_name();
        calculate cal = new calculate();
        int result = cal.add(num1, num2);
        System.out.println(result);
    }

}
