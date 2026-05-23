package number_Program;
public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
        public static void main(String[] args) {

        printFibonacci(10);
    }
}