package number_Program;

public class NeonNumber {
    public static void checkNeon(int num) {

        int square = num * num;
        int sum = 0;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }
    }
    public static void main(String[] args) {

        checkNeon(9);
        checkNeon(10);
    }
}