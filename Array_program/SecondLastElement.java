package Array;

public class SecondLastElement {
    static int secondLast(int[] arr) {
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Second Last Element = " + secondLast(arr));
    }
}