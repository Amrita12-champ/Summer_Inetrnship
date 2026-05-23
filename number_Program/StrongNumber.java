package number_Program;
public class StrongNumber {
    public static void checkStrong(int number) {

        int original = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
        }
        if (sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is not a Strong Number");
        }
    }
    public static void main(String[] args) {

        checkStrong(145);
        checkStrong(123);
    }
}