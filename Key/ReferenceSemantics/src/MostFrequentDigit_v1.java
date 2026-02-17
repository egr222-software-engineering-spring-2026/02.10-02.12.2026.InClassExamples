public class MostFrequentDigit_v1 {
    public static void main(String[] args) {
        int x = 124556788;  // most frequent digit is 5

        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            if (lastDigit == 0) counter0++;
            else if (lastDigit == 1) counter1++;
            else if (lastDigit == 2) counter2++;
            else if (lastDigit == 3) counter3++;
            else if (lastDigit == 4) counter4++;
            else if (lastDigit == 5) counter5++;
            else if (lastDigit == 6) counter6++;
            else if (lastDigit == 7) counter7++;
            else if (lastDigit == 8) counter8++;
            else counter9++;

            x /= 10;    // remove last digit (because it has already been counted)
        }

        int mostFrequentDigit = 0;
        int mostFrequentDigitCount = counter0;
        if (counter1 > mostFrequentDigitCount) {
            mostFrequentDigit = 1;
            mostFrequentDigitCount = counter1;
        }
        if (counter2 > mostFrequentDigitCount) {
            mostFrequentDigit = 2;
            mostFrequentDigitCount = counter2;
        }
        if (counter3 > mostFrequentDigitCount) {
            mostFrequentDigit = 3;
            mostFrequentDigitCount = counter3;
        }
        if (counter4 > mostFrequentDigitCount) {
            mostFrequentDigit = 4;
            mostFrequentDigitCount = counter4;
        }
        if (counter5 > mostFrequentDigitCount) {
            mostFrequentDigit = 5;
            mostFrequentDigitCount = counter5;
        }
        if (counter6 > mostFrequentDigitCount) {
            mostFrequentDigit = 6;
            mostFrequentDigitCount = counter6;
        }
        if (counter7 > mostFrequentDigitCount) {
            mostFrequentDigit = 7;
            mostFrequentDigitCount = counter7;
        }
        if (counter8 > mostFrequentDigitCount) {
            mostFrequentDigit = 8;
            mostFrequentDigitCount = counter8;
        }
        if (counter9 > mostFrequentDigitCount) {
            mostFrequentDigit = 9;
            mostFrequentDigitCount = counter9;
        }

        System.out.println(mostFrequentDigit);
    }
}