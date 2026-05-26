package Array;
public class ReverseCharacters {

    static void reverse(char[] ch) {

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }

    public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D', 'E'};

        reverse(ch);
    }
}