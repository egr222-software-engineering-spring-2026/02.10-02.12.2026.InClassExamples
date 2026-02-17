public class IntegerAssignFail {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        y = 17;

        System.out.println(x);    // prints 5
        System.out.println(y);    // prints 17
    }
}
