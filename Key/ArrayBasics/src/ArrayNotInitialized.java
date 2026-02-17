public class ArrayNotInitialized {
    public static void main(String[] args) {
        // array of Strings with 3 elements
        String[] strings = new String[3];

        System.out.println(strings[1].length());    // throws NullPointerException
    }
}