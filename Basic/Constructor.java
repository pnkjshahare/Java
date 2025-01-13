
class Demo {

    private String Name;
    private int age;
    private String address;

    public Demo() {
        System.out.println("Hello from constructor");
    }

    public Demo(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name :" + Name);
        System.out.println("Age :" + age);
    }

}

class Constructor {

    public static void main(String[] args) {
        Demo obj = new Demo("pankaj", 23);
        Demo obj1 = new Demo("parnay", 24);
        Demo obj2 = new Demo();
        obj.show();
        obj1.show();
    }

}
