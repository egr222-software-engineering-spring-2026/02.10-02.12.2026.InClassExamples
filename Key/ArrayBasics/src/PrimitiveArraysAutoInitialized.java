public class PrimitiveArraysAutoInitialized {
    public static void main(String[] args) {
        int[] integers = new int[3];
        double[] doubles = new double[3];

        System.out.println(integers[1]);    // prints 0
        System.out.println(doubles[1]);     // prints 0.0
    }
}