
public class StringArraySort {
    static void sortStrings(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Standard swap operation
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Ram", "Amar", "Cel", "David", "Bunny"};
        sortStrings(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"," +"");
        }
        
    }
}