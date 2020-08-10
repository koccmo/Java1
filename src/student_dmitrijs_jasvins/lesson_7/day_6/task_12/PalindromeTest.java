package student_dmitrijs_jasvins.lesson_7.day_6.task_12;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.textIsPalindrome();
    }
    public void textIsPalindrome () {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("Le, VEl");
    }
}
