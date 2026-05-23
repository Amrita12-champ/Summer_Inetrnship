package number_Program;

public class DuckNumber {

    // Method to check Duck number
    public static void checkDuck(int number) {

        int original = number;
        boolean isDuck = false;

        // Check digits for zero
        while (number != 0) {
            int digit = number % 10;

            if (digit == 0) {
                isDuck = true;
                break;
            }
            number = number / 10;
        }
        if (isDuck) {
            System.out.println(original + " is a Duck Number");
        } else {
            System.out.println(original + " is not a Duck Number");
        }
    }

    // Main method
    public static void main(String[] args) {

        checkDuck(1023);
        checkDuck(1234);
    }
}