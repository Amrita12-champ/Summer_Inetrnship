package Array;

public class ArrayMerge {

    static void copyElements(int[] source, int[] destination, int startIndex) {
        for (int i = 0; i < source.length; i++) {
            destination[startIndex + i] = source[i];
        }
    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        copyElements(arr1, result, 0);
        copyElements(arr2, result, arr1.length);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = mergeArrays(arr1, arr2);
      
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
     
    }
}