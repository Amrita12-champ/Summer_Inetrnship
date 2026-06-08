package Array;

public class ArrayDuplicateRemover {

    static boolean isAlreadyAdded(int[] temp, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (temp[i] == value) {
                return true;
            }
        }
        return false;
    }

    static int[] copyToFinalArray(int[] temp, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!isAlreadyAdded(temp, uniqueCount, arr[i])) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        return copyToFinalArray(temp, uniqueCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        int[] result = removeDuplicates(arr);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
       
    }
}