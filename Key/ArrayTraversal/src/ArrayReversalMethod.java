import java.util.Arrays;

public class ArrayReversalMethod {
    public static void main(String[] args) {
        int[] numbers1 = {11, 42, -5, 27, 0, 89};
        int[] numbers2 = {17, 56, -23, 7, 1, -90};

        System.out.println(Arrays.toString(reverseIntArray(numbers1)));   // prints reversed array
        System.out.println(Arrays.toString(reverseIntArray(numbers2)));   // prints reversed array
    }

    public static int[] reverseIntArray(int[] numbers) {
        // reverse the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        return numbers;
    }
}
