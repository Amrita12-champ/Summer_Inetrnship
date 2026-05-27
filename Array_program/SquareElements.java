package Array;
public class SquareElements {
    
    static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Square of Elements:");
        square(arr);
    }
}