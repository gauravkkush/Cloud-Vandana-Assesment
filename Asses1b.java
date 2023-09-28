import java.util.*;

public class Asses1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Roman:" + str);
        System.out.println("Integer:" + romanToInt(str.toUpperCase()));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int num = 0;
        int prevVal = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            int currVal = values.get(curr);

            if (currVal < prevVal) {
                num -= currVal;
            } else {
                num += currVal;
            }

            prevVal = currVal;
        }
        return num;
    }
}
