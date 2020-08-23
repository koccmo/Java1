package student_alexey_tretyakov.lesson_7.level_1;

import java.util.Arrays;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
//import java.util.Objects;

@CodeReview(approved = false)
class WordServiceMainTest {

    public static void main(String[] args) {

        WordServiceMainTest wordServiceMainTest = new WordServiceMainTest();
        wordServiceMainTest.wordServiceTest();
        wordServiceMainTest.spiltStringTest();
        wordServiceMainTest.wordCounterTest();
        wordServiceMainTest.findIndexOfMaxTimesTest();

    }

    private void wordServiceTest(){

        WordService wordService = new WordService();
        @CodeReviewComment(teacher = "Зачем объявление переменной выносить в отдельную строку?")
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        testString = wordService.findMostFrequentWord( testString );
        testResult( ( testString.equals("Hello")), "Word service.");
    }
    private void spiltStringTest () {
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        String [] simpleArray = {"Hello", "!", "Hello", "all", "!", "Hello", "all", "programmers", "!",
                "Hello", "all", "Java's", "programmers", "!" };
        testResult( Arrays.equals( testString.split(" "), simpleArray),"Split string." );
    }
    private void  wordCounterTest (){
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        WordService testWordService = new WordService();
        int [] testCounter = testWordService.wordCounter( testString.split(" "));
        int [] simpleArray = { 4, 4, 4, 3, 4, 4, 3, 2, 4, 4, 3, 1, 2, 4};
        testResult(Arrays.equals( testCounter, simpleArray ), "Word counter.");
    }
    private void findIndexOfMaxTimesTest () {
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        WordService testWordService = new WordService();
        int [] testCounter = testWordService.wordCounter( testString.split(" "));
        testResult(testWordService.findIndexOfMaxTimes(testCounter) == 0,"Find index of max times.");
    }

    private void testResult(boolean status, String testingString ) {
        if ( status ) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}
