package Array;
public class CountZeros {
    static int zeroCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 6, 0};
        System.out.println("Number of Zeros = " + zeroCount(arr));
    }
}
