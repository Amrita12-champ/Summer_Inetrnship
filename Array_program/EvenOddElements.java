package Array;

public class EvenOddElements {

    static void evenElements(int[] arr) {

        System.out.println("Even Elements:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    
    static void oddElements(int[] arr) {

        System.out.println("\nOdd Elements:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        evenElements(arr);

        oddElements(arr);
    }
}
