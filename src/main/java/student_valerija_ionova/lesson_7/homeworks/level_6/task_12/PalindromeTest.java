package student_valerija_ionova.lesson_7.homeworks.level_6.task_12;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PalindromeTest {
    public static void main(String [] args){
        PalindromeTest palindromeTest = new PalindromeTest();

        palindromeTest.testIsPalindromeIfPalindromeSixLetters();
        palindromeTest.testIsPalindromeIfPalindromeFiveLetters();

        palindromeTest.testIsPalindromeIfIsntPalindromeFiveLetters();
        palindromeTest.testIsPalindromeIfIsntPalindromeSixLetters();
    }

    public void checkStringArray(String name, String [] methodsResult, String [] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }


    public void testIsPalindromeIfPalindromeSixLetters(){
        Palindrome palindrome = new Palindrome();
        checkBoolean("testIsPalindromeIfPalindromeSixLetters", palindrome.isPalindrome("lovvol"),true);
    }

    public void testIsPalindromeIfPalindromeFiveLetters(){
        Palindrome palindrome = new Palindrome();
        checkBoolean("testIsPalindromeIfPalindromeFiveLetters", palindrome.isPalindrome("lovol"),true);
    }

    public void testIsPalindromeIfIsntPalindromeSixLetters(){
        Palindrome palindrome = new Palindrome();
        checkBoolean("testIsPalindromeIfPalindromeSixLetters", palindrome.isPalindrome("lokhol"),false);
    }

    public void testIsPalindromeIfIsntPalindromeFiveLetters(){
        Palindrome palindrome = new Palindrome();
        checkBoolean("testIsPalindromeIfPalindromeFiveLetters", palindrome.isPalindrome("brvol"),false);
    }
}
