package Array;
public class SmallestElement {
   
    static int smallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        System.out.println("Smallest Element = " + smallest(arr));
    }
}