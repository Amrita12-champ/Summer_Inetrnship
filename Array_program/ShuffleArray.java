public class ShuffleArray {

    static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int randomIndex = (int) (Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        shuffle(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  "," + "");
        }
    }
}