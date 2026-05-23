package number_Program;
public class ArmstrongNumber {
    public static void checkArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (original == sum) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
    public static void main(String[] args) {

        checkArmstrong(153);
        checkArmstrong(123);
    }
}
