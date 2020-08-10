package student_volodya_danilin.lesson_7.level_6;

import java.util.Arrays;

public class Palindrome {

    boolean isPalindrome(String text) {
        boolean result = false;
        text = text.toLowerCase().replaceAll("[^a-zA-Z]", "").trim();
        int len = text.length();
        char[] textChars = new char[len];
        char[] textCharsReverse = new char[len];
        int j;
        for (int i = 0; i < len; i++) {
            j = len -1 - i;
            textChars[i] = text.charAt(i);
            textCharsReverse[i] = text.charAt(j);
        }
        if (Arrays.equals(textChars, textCharsReverse)) {
            result = true;
        }
        return result;
    }
}

class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    String truePalindrome = "abcba";
    String falsePalindrome = "aaabbb";

    public static void main(String[] Args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testIsPalindrome();

    }

    void testIsPalindrome() {
        System.out.println("Testing boolean isPalindrome method...");
        System.out.print(this.truePalindrome + " should be true :");
        System.out.print(palindrome.isPalindrome(this.truePalindrome));
        System.out.println();
        System.out.print(this.falsePalindrome + " should be false : ");
        System.out.print(palindrome.isPalindrome(this.falsePalindrome));
    }
}