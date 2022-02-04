package roman.lesson_7.homework.day_6.task_12;

import roman.lesson_5.homework.day_2.task_12.Array;

import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.textContainNumber();
        test.textPrepareToCharArray();
        test.checkIfCharArrayIsPalindrome();
        test.checkIsPalindrome();


    }
    public void checkIsPalindrome() {
        Palindrome check = new Palindrome();
        String text = "Level";
        boolean expectedAnswer = true;
        checkResult(check.isPalindrome(text) == expectedAnswer, "Check if Text is Palindrome");

    }
    public void checkIfCharArrayIsPalindrome() {
        Palindrome check = new Palindrome();
        char[] charArray = {'l', 'e', 'v', 'e', 'l'};
        boolean expectedAnswer = true;
        checkResult(check.checkIfArrayIsPalindrome(charArray) == expectedAnswer,
                "Check if Char Array Is Palindrome");
    }

    public void textPrepareToCharArray() {
        Palindrome check = new Palindrome();
        String text = "Level43";
        char[] expectedAnswer = {'l', 'e', 'v', 'e', 'l'};
        checkResult(Arrays.equals(check.textToCharArray(text), expectedAnswer), "Prepare text to char array");
    }

    public void textContainNumber(){
        Palindrome check = new Palindrome();
        String text = "Level43";
        boolean expectedAnswer = true;
        checkResult(check.containNumbersInText(text) == expectedAnswer, "Text contain number");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test = OK!");
        } else {
            System.out.println(nameOfTest + " test = FAIL!");
        }
    }

}
