public class NullStringExample {
    public static void main(String[] args) {
        String a1 = null;
        String a2 = "";
//        System.out.println("The length of a1 is " + a1.length());  // throws NullPointerException
        System.out.println("The length of a2 is " + a2.length());  // prints "The length of a2 is 0"
    }
}