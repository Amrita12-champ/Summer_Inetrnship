package Array;

public class EvenDigitSumCalculator {

    static boolean isEven(int digit) {
        return digit % 2 == 0;
    }

    static int sumEvenDigits(int num) {
        int evenSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isEven(digit)) {
                evenSum = evenSum + digit;
            }
            num = num / 10;
        }
        return evenSum;
    }

    static int[] processEvenDigitSums(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = sumEvenDigits(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {231, 554, 572, 962, 24, 1};
        int[] result = processEvenDigitSums(arr);
    
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
    }
}