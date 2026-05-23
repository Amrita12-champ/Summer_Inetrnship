package number_Program;
public class CountDigit {
    public static void countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
    public static void main(String[] args) {

        countDigits(12345);
    }
}