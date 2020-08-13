package student_eduards_jasvins.lesson_7.day_6.task_12;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindrome();
        palindromeTest.notPalindrome();
    }

    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("racecar");
    }

    public void notPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome("jewel");
    }

}
