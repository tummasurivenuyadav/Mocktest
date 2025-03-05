import java.util.Scanner;

public class StringPalindrome {
    public static boolean palin(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return palin(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the word to check if it is a palindrome: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        boolean result = palin(str, 0, str.length() - 1);
        
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}