package student_anvars_intezars.home_tasks.lesson_7.day_6.task12;

//К положитнльному сценарию добавлен также и отрицательный сценарий
class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testForPalindrome();
        palindromeTest.testForPalindrome2();
    }

    void testForPalindrome() {
        Palindrome palindrome = new Palindrome();
        String palindromeTextExample = ("nolemonnomelon");
        boolean result = palindrome.isPalindrome(palindromeTextExample);
        if (result) {
            System.out.println("Test for palindrome = OK");
        } else {
            System.out.println("Test for palindrome = FAIL");
        }
    }

    void testForPalindrome2() {
        Palindrome palindrome = new Palindrome();
        String palindromeTextExample = ("mydogishappy");
        boolean result = palindrome.isPalindrome(palindromeTextExample);
        if (result) {
            System.out.println("Second test for palindrome = OK");
        } else {
            System.out.println("Second test for palindrome = FAIL");
        }
    }
}
