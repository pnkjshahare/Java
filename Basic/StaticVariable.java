
class Mobile {

    String brand;
    static int price;
    String battery;

    public void Show() {
        System.out.println("Brand : " + brand);
        System.out.println("price : " + price);
        System.out.println("battery : " + battery);
    }
}

class StaticVariable {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Vivo";
        Mobile.price = 12500;
        obj1.battery = "5000mh";

        obj2.brand = "Poco";
        Mobile.price = 12000;
        obj2.battery = "5500mh";
        obj1.Show();
        obj2.Show();
    }
}
