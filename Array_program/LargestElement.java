package Array;
public class LargestElement {

    static int largest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4};

        System.out.println("Largest Element = " + largest(arr));
    }
}