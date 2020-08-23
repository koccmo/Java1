package student_jaroslav_brutan.lesson_7.day_6.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest();
        test.isNotPalindromeTest();
    }

    public void isPalindromeTest(){
        Palindrome pal = new Palindrome();
        String text = "level";
        boolean result = pal.isPalindrome(text);
        if (result){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void isNotPalindromeTest(){
        Palindrome pal = new Palindrome();
        String text = "great";
        boolean result = pal.isPalindrome(text);
        if (result){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
