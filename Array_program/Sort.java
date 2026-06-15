import java.util.Arrays;

public class Sort {
    static void sortElements(int[] arr) {
   
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 6};
        sortElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"");
        }
    }
}