package student_aleksandra_maksimovic.lesson_7.level_6.task_12;

import student_aleksandra_maksimovic.testing.Tester;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.palindromeTrueTest();
        test.PalindromeFalseTest();
        test.PalindromeNullTextTest();
        test.findValidCharPosTest();
        test.isValidCharTest();
        test.isValidCharTest2();
    }

    Tester tester = new Tester();

    public void palindromeTrueTest() {
        Palindrome palindrome = new Palindrome();
        tester.check(palindrome.isPalindrome(" S ...uM ...mU.. s"), "Is palindrome true test #1");
    }

    public void PalindromeFalseTest() {
        Palindrome palindrome = new Palindrome();
        tester.check(!palindrome.isPalindrome("hELLO wORLD"), "Is not palindrome test #1");
    }

    public void PalindromeNullTextTest() {
        Palindrome palindrome = new Palindrome();
        tester.check(!palindrome.isPalindrome("       ..       "), "No text to check palindrome test #1");
    }

    public void findValidCharPosTest() {
        Palindrome palindrome = new Palindrome();
        tester.check(palindrome.findValidCharPos(",,..1...", 0)== 4, "Is valid char position  test #1");
    }

    public void isValidCharTest() {
        Palindrome palindrome = new Palindrome();
        tester.check(palindrome.isValidChar('c'), " Is valid char test #1");
    }

    public void isValidCharTest2() {
        Palindrome palindrome = new Palindrome();
        tester.check(!palindrome.isValidChar(' '), "Is valid char Test #2" );
    }

}
