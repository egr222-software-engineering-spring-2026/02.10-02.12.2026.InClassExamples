public class AverageMethodClient {
    public static void main(String[] args) {
        // figure out the average TA IQ
        int[] iq = {126, 84, 149, 167, 95};
        double avg = average(iq);
        System.out.println("Average IQ = " + avg);
    }

    public static double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];    // sum = sum + numbers[i];
        }
        return sum / numbers.length;
    }
}