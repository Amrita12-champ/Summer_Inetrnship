package Array;
public class DistinctTwoArrays {

    static int getElementCount(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static void findDistinct(int[] arr1, int[] arr2) {

        int[] combined = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }

        System.out.print("Output = ");
        for (int i = 0; i < combined.length; i++) {
            if (getElementCount(combined, combined[i]) == 1) {
                System.out.print(combined[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 5, 8, 9, 3, 1};
        findDistinct(arr1, arr2);
    }
}