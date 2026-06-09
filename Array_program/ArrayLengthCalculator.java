public class ArrayLengthCalculator {

    static int calculateLength(int[] arr) {
        int count = 0;
        for (int element : arr) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};
        int result = calculateLength(arr);

        System.out.println("Length = " + result);
    }
}