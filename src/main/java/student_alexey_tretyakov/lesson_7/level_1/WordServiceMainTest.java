package student_alexey_tretyakov.lesson_7.level_1;

import java.util.Arrays;

//@CodeReview(approved = false)
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
        String testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        testString = wordService.findMostFrequentWord( testString );
        testResult("Word service.", ( testString.equals("Hello")));
    }
    private void spiltStringTest () {
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        String [] simpleArray = {"Hello", "!", "Hello", "all", "!", "Hello", "all", "programmers", "!",
                "Hello", "all", "Java's", "programmers", "!" };
        testResult("Split string.", Arrays.equals( testString.split(" "), simpleArray));
    }
    private void  wordCounterTest (){
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        WordService testWordService = new WordService();
        int [] testCounter = testWordService.wordCounter( testString.split(" "));
        int [] simpleArray = { 4, 4, 4, 3, 4, 4, 3, 2, 4, 4, 3, 1, 2, 4};
        testResult("Word counter.", Arrays.equals( testCounter, simpleArray ));
    }
    private void findIndexOfMaxTimesTest () {
        String testString;
        testString = "Hello ! Hello all ! Hello all programmers ! Hello all Java's programmers !";
        WordService testWordService = new WordService();
        int [] testCounter = testWordService.wordCounter( testString.split(" "));
        testResult("Find index of max times.", testWordService.findIndexOfMaxTimes(testCounter) == 0);
    }

    private void testResult( String testName, boolean testStatus) {
        if ( testStatus ) {
            System.out.println( testName + " Test OK.");
        } else {
            System.out.println( testName + " Test FAIL!!!");
        }
    }
}
