package Array;

public class ArrayElementAdder {

    static int getElementValue(int[] arr, int index) {
        if (index < arr.length) {
            return arr[index];
        }
        return 0;
    }

    static int[] addTwoArrays(int[] arr1, int[] arr2) {
        int maxLength = arr1.length;
        if (arr2.length > maxLength) {
            maxLength = arr2.length;
        }
        
        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = getElementValue(arr1, i) + getElementValue(arr2, i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 1};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 9};
        int[] result = addTwoArrays(arr1, arr2);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
       
    }
}