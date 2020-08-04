package student_igors_bartkevics.lesson_7.homework.level_6.task_12;

import java.util.Arrays;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.transformTextTest();
        test.isNotPalindromeTest();
        test.isPalindromeTest();
    }

    public void isNotPalindromeTest() {
        String notPalindrome = "Le,VEl is le..vel";

        boolean condition = !palindrome.isPalindrome(notPalindrome);
        checkResult(condition, "Is not palindrome");
    }

    public void isPalindromeTest() {
        String isPalindrome1 = "Le,VEl is si le..vel";
        String isPalindrome2 = "sum summus mus";
        String isPalindrome3 = "racecar";
        String isPalindrome4 = "А роза упала на лапу Азора";

        boolean condition1 = palindrome.isPalindrome(isPalindrome1);
        checkResult(condition1, "Is palindrome");

        boolean condition2 = palindrome.isPalindrome(isPalindrome2);
        checkResult(condition2, "Is palindrome");

        boolean condition3 = palindrome.isPalindrome(isPalindrome3);
        checkResult(condition3, "Is palindrome");

        boolean condition4 = palindrome.isPalindrome(isPalindrome4);
        checkResult(condition4, "Is palindrome");
    }

    public void transformTextTest() {
        String text = "Le,VEl is le..vel";
        char[] expectedResult = "levelislevel".toCharArray();
        char[] result = palindrome.transformText(text);

        boolean condition = Arrays.equals(expectedResult, result);
        checkResult(condition, "Transform text");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
