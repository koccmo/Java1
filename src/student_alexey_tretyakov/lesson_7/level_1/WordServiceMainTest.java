package student_alexey_tretyakov.lesson_7.level_1;

import java.util.Objects;

class WordServiceMainTest {

    public static void main(String[] args) {

        WordServiceMainTest wordServiceMainTest = new WordServiceMainTest();
        wordServiceMainTest.wordServiceTest();

    }

    public void wordServiceTest(){

        WordService wordService = new WordService();
        String testString;
        testString = "Hello ! Hello all ! Hello all programmer ! Hello all Java's programmer !";
        testResult( Objects.equals(wordService.findMostFrequentWord(testString), "Hello"), "Word service.");
    }

    private void testResult(boolean status, String testingString ) {
        if ( status ) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}
