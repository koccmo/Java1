package student_dmitrijs_jasvins.lesson_7.day_6.task_12;

import java.util.Arrays;

public class Palindrome {

    boolean isPalindrome(String text) {
        String formattedText = text.replaceAll("\\W", "").toLowerCase();
        char[] textArray = formattedText.toCharArray();
        char[] reversedTextArray = reverseArray(textArray);

        if (Arrays.equals(textArray, reversedTextArray)) {
            System.out.println("Entered string is a palindrome");
            return true;
        } else {
            System.out.println("Entered string is not a palindrome");
            return false;
        }
    }

    private char[] reverseArray(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = array.length - 1 - i;
            reverse[newIndex] = array[i];
        }
        return reverse;
    }
}
