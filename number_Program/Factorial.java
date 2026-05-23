package number_Program;

public class Factorial {
    public static void findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {
        findFactorial(5);
    }
}