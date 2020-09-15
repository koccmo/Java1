package student_eduards_jasvins.lesson_7.day_6.task_12;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindrome();
        palindromeTest.notPalindrome();
    }

    @CodeReviewComment(teacher = "Это не автоматический тест!")
    @CodeReviewComment(teacher = "Автоматический тест должен проверять результат!")
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("racecar");
    }

	@CodeReviewComment(teacher = "Это не автоматический тест!")
	@CodeReviewComment(teacher = "Автоматический тест должен проверять результат!")
	public void notPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("jewel");
    }

}
