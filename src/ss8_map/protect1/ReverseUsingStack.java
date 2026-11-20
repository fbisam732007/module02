package ss8_map.protect1;

import java.util.Arrays;
import java.util.Stack;

public class ReverseUsingStack {
    public static void reverseArray(int[] a) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }
    }

    public static String reverseString(String s) {
        Stack<String> wStack = new Stack<>();

        String[] words = s.trim().split("\\s+");
        for (String mWord : words) {
            wStack.push(mWord);
        }

        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            String mWord = wStack.pop();
            output.append(mWord);
            if (!wStack.isEmpty()) {
                output.append(" ");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(arr));

        String str = "Toi yeu lap trinh Java cua Chanh";
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("Chuỗi sau khi đảo: " + reverseString(str));
    }
}
