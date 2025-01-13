
class StringBasic {

    public static void main(String[] args) {

        /*
        
        String name = "pankaj shahare";
        String name1 = "pankaj shahare";
        System.out.println(name);
        System.out.println(name1);
        if (name == name1) {
            System.out.println("correct");
        } else {
            System.out.println("error");
        }
        name1 = "demo ";
        System.out.println(name1);

        System.out.println("Reverse String :" + name.repeat(2));
         */
        StringBuffer name = new StringBuffer("pankaj");
        String str = " Shahare";
        name.append(str);
        System.out.println("String Length :" + name.length());
        System.out.println(name);
        System.out.println(name.reverse());
        System.out.println("Substring :" + name.substring(1, 5));
    }
}

// string buffer ->thread safe
//string builder-> not thread safe
