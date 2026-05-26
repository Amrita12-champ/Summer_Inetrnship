package Array;

public class IndexSum {
    static int evenIndexSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    static int oddIndexSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Even Index Sum = " + evenIndexSum(arr));
        System.out.println("Odd Index Sum = " + oddIndexSum(arr));
    }
}