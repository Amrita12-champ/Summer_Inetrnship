package Array;
public class LastIndexValue {

    static int lastIndex(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 9, 4, 9, 6, 7, 8};
        int key = 9;
        System.out.println("Last Index = " + lastIndex(arr, key));
    }
}