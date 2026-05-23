package number_Program;
public class PerfectNumber {
    public static void checkPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }
    }

    public static void main(String[] args) {

        checkPerfect(28);
        checkPerfect(15);
    }
}