public class RepeatedElements {
    static boolean isDuplicate(int[] arr, int targetIndex) {
        for (int i = 0; i < targetIndex; i++) {
            if (arr[i] == arr[targetIndex]) {
                return true; 
            }
        }
        return false;
    }

    static boolean hasMoreOccurrences(int[] arr, int targetIndex) {
        for (int i = targetIndex + 1; i < arr.length; i++) {
            if (arr[i] == arr[targetIndex]) {
                return true;
            }
        }
        return false;
    }

    static void printDuplicates(int[] arr) {
        System.out.print("Output = ");
        for (int i = 0; i < arr.length; i++) {
            if (hasMoreOccurrences(arr, i) && !isDuplicate(arr, i)) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2};
        printDuplicates(arr);
    }
}