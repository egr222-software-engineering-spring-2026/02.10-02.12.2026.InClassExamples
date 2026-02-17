public class IntegerSwapFail {
    public static void main(String[] args) {
        int a = 7;
        int b = 35;

        // swap a with b?
        swap(a, b);

        System.out.println(a + " " + b);    // NOT swapped
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}