package number_Program;

public class ReverseNumber {
    public static void reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;   
            reverse = reverse * 10 + digit;
            num = num / 10;        
        }
        System.out.println("Reversed No. = " + reverse);
    }
        public static void main(String[] args) {

        reverseNumber(12345);
    }
}
