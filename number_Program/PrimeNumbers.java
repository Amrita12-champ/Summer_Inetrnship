package number_Program;

public class PrimeNumbers {

    public static void printPrimes(int n) {

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {

        printPrimes(50);
    }
}