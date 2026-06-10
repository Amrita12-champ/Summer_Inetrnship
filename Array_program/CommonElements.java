package Array;

public class CommonElements {
    static boolean existsInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
    static boolean alreadyChecked(int[] arr, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (arr[i] == arr[currentIndex]) {
                return true;
            }
        }
        return false;
    }

    static void findCommon(int[] arr1, int[] arr2) {
        System.out.print("Output = ");
        for (int i = 0; i < arr1.length; i++) {
            int currentNum = arr1[i];
            if (existsInArray(arr2, currentNum) && !alreadyChecked(arr1, i)) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 5, 8, 9, 3, 1};
        findCommon(arr1, arr2);
    }
}