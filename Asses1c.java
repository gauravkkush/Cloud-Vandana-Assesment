import java.util.HashSet;
import java.util.Scanner;

public class Asses1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        scanner.close();
        System.out.print(isPangram(input.toLowerCase()));
    }

    public static boolean isPangram(String str) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}
