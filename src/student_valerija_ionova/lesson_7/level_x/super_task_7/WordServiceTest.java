package student_valerija_ionova.lesson_7.level_x.super_task_7;

import java.util.Arrays;

public class WordServiceTest {

    public static void main (String [] args){
        WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.testFindMostFrequentWordThreeWords();
        wordServiceTest.testFindMostFrequentWordFourWord();
        wordServiceTest.testtestFindMostFrequentWordFourWordSameCount();

        wordServiceTest.convertStringToWordArray();

        wordServiceTest.testCreateWordCountArray();
        wordServiceTest.testFillWordCountArray();
        wordServiceTest.testCountWords();

        wordServiceTest.testIndexOfMostFrequentWordInArray();

    }

    public void printResultOfTest(String name,boolean ifTestPassed){
        if (ifTestPassed){
            System.out.println(name+" OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        printResultOfTest(name, methodsResult.equals(expectedResult));
    }

    public void checkStringArray(String name, String [] methodsResult, String [] expectedResult){
        printResultOfTest(name, Arrays.equals(methodsResult, expectedResult));
    }

    public void checkIntArray(String name, int [] methodsResult, int [] expectedResult){
        printResultOfTest(name, Arrays.equals(methodsResult, expectedResult));
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }



    public void testFindMostFrequentWordThreeWords(){
        WordService wordService = new WordService();

        checkString("testFindMostFrequentWordThreeWords", wordService.findMostFrequentWord("Bob found Bob"), "Bob");
    }

    public void testFindMostFrequentWordFourWord(){
        WordService wordService = new WordService();
        //System.out.println(wordService.findMostFrequentWord("Bob found John"));
        checkString("testFindMostFrequentWordFourWord", wordService.findMostFrequentWord("Bob found John Alla"), "Bob");
    }

    public void testtestFindMostFrequentWordFourWordSameCount(){
        WordService wordService = new WordService();

        checkString("testtestFindMostFrequentWordFourWordSameCount", wordService.findMostFrequentWord("Bob found Bob and foun Robert and"), "Bob");
    }


    public void convertStringToWordArray(){
        WordService wordService = new WordService();

        String [] expectedArray = {"Bob", "found", "Bob"};
        checkStringArray("convertStringToWordArray", wordService.convertStringToWordArray("Bob found Bob"), expectedArray);
    }

    public void testCreateWordCountArray(){
        WordService wordService = new WordService();

        String [] arrayOfWords = {"Bob", "found", "Bob"};
        int[] expectedArray = {0, 0, 0};
        checkIntArray ("testCreateWordCountArray", wordService.createWordCountArray(arrayOfWords), expectedArray);
    }

    public void testFillWordCountArray(){
        WordService wordService = new WordService();

        String [] arrayOfWords = {"Bob", "found", "Bob"};
        int [] newWordCountArray = new int [3];
        int[] expectedArray = {2, 1, 2};
        checkIntArray ("testFillWordCountArray", wordService.fillWordCountArray(arrayOfWords, newWordCountArray), expectedArray);
    }

    public void testCountWords(){
        WordService wordService = new WordService();

        String [] arrayOfWords = {"Bob", "found", "Bob"};
        checkInt ("testCountWords", wordService.countWords(arrayOfWords, 2), 2);
    }


    public void testIndexOfMostFrequentWordInArray(){
        WordService wordService = new WordService();

        int[] wordCountArray = {2, 1, 2, 1, 2};
        checkInt ("testIndexOfMostFrequentWordInArray", wordService.indexOfMostFrequentWordInArray(wordCountArray), 0);
    }
}
