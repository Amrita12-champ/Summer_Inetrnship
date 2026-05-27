package Array;
public class MaximumOccurredElement {

    static void maxOccurred(int[] arr) {

        int maxCount = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Count = " + maxCount);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 1, 4};

        maxOccurred(arr);
    }
}