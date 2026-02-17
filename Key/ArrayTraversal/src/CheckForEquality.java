public class CheckForEquality {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = {1,2,3,4};

        System.out.println(areEqual(a, b));    // prints true
        System.out.println(areEqual(a, c));    // prints false
    }

    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i=0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}