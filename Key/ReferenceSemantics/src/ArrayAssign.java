import java.util.Arrays;

public class ArrayAssign {
    public static void main(String[] args) {
        int[] a1 = {4, 15, 8};
        int[] a2 = a1;
        a2[0] = 7;

        System.out.println(Arrays.toString(a1));
    }
}