import java.util.Arrays;

public class DoubleMethodClient {
    public static void main(String[] args) {
        int[] numbers = {1,4,0,7};
        int[] doubledNumbers = doubleArray(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(doubledNumbers));
    }

    public static int[] doubleArray(int[] numbers) {
        int[] result = new int[2 * numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[2 * i]     = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }
}