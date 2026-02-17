public class MostFrequentDigit_v2 {
    public static void main(String[] args) {
        int x = 124556788;  // most frequent digit is 5
        System.out.println(mostFrequentDigit(x));

        x = 406814568;  // most frequent digit is 4
        System.out.println(mostFrequentDigit(x));

        x = 669260267; // most frequent digit is 6
        System.out.println(mostFrequentDigit(x));
    }

    public static int mostFrequentDigit(int n) {
        int[] counts = new int[10];

        while (n > 0) {
            int lastDigit = n % 10;
            counts[lastDigit]++;  // increment the counter for the last digit
            n /= 10;    // remove last digit (because it has already been counted)
        }

        int bestIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (counts[i] > counts[bestIndex]) {
                bestIndex = i;
            }
        }

        return bestIndex;
    }
}