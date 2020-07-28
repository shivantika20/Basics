public class DataTypes {
    public static void main(String args[]) {
        byte b1 = 29; //shouldnt be more than 2 digits
        short s1 = 20; // shouldnt be more than 5 digits
        int i1 = 250; // shouldnt be more than 9 digits
        long l1 = 2555;  //not more than 10
        double d1 = 29.20;
        float f1 = 2520.2f;  // require f
        boolean b2 = true;   //only true or false
        char c1 = 'A';       //only one character and in one quotes, if double quotes its string

        System.out.println("Byte is " + b1);
        System.out.println("Short is " + s1);
        System.out.println("Int is " + i1);
        System.out.println("Long is " + l1);
        System.out.println("Double is " + d1);
        System.out.println("Float is " + f1);
        System.out.println("Boolean is " + b2);
        System.out.println("Char is " + c1);

    }
}
