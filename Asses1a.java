
//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.*;

public class Asses1a {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Random random = new Random();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}