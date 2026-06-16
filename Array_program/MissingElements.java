public class MissingElements {

    static boolean searchNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static void printMissing(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = min; i <= max; i++) {
            if (!searchNumber(arr, i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 13};
        printMissing(arr);
    }
}