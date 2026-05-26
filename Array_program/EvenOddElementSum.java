package Array;

public class EvenOddElementSum {

    static int evenSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    static int oddSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Even Elements Sum = " + evenSum(arr));
        System.out.println("Odd Elements Sum = " + oddSum(arr));
    }
}