public class CharacterArraySort {

    static void sortCharacters(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'R', 'A', 'C', 'D', 'B'};
        sortCharacters(arr);
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", " + "");
        }
    }
}