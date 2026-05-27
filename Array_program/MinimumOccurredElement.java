package Array;
public class MinimumOccurredElement {
    static void minOccurred(int[] arr) {

        int minCount = arr.length;
        int element = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Count = " + minCount);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 2, 1};

        minOccurred(arr);
    }
}