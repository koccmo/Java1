package student_anvars_intezars.home_tasks.lesson_7.day_6.task12;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Нужены тесты как на положительный сценарий так и на отрицательный.")
class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testForPalindrome();
        palindromeTest.testForPalindrome2();
    }

    void testForPalindrome() {
        Palindrome palindrome = new Palindrome();
        String palindromeTextExample = ("no lemon no melon");
        boolean result = palindrome.isPalindrome(palindromeTextExample);
        if (result) {
            System.out.println("Test for palindrome = OK");
        }else {
            System.out.println("Test for palindrome = FAIL");
        }
    }

    void testForPalindrome2() {
        Palindrome palindrome = new Palindrome();
        String palindromeTextExample = ("my dog is happy");
        boolean result = palindrome.isPalindrome(palindromeTextExample);
        if (result) {
            System.out.println("Second test for palindrome = OK");
        } else {
            System.out.println("Second test for palindrome = FAIL");
        }
    }
}
