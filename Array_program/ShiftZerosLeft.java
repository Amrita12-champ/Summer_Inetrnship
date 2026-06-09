
public class ShiftZerosLeft {

    static int countZeros(int[] arr) {
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        return zeros;
    }

    static int[] moveZerosToLeft(int[] arr) {
        int[] result = new int[arr.length];
        int index = countZeros(arr); // Start placing non-zeros after the zeros

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};
        int[] result = moveZerosToLeft(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
    }
}