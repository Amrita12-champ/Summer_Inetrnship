package number_Program;

public class GcdNum {

    public static void findGCD(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
    }
    public static void main(String[] args) {

        findGCD(12, 18);
    }
}
    



