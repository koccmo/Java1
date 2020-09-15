package student_dmitrijs_jasvins.lesson_7.day_6.task_12;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class PalindromeTest {

	@CodeReviewComment(teacher = "Нужны тесты и на позитивный и негативный сценарии.")
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.textIsPalindrome();
    }
    public void textIsPalindrome () {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("Le, VEl");
    }
}
