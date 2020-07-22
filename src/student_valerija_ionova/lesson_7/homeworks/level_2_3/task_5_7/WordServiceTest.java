package student_valerija_ionova.lesson_7.homeworks.level_2_3.task_5_7;

import java.util.Arrays;

public class WordServiceTest {
    public static void main(String [] args){
        WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.testCountNumberOfWords1();
        wordServiceTest.testCountNumberOfWords2();
        wordServiceTest.testCountNumberOfWords3();
        wordServiceTest.testCountNumberOfWords4();

        wordServiceTest.testCreateArrayOfWords();
        wordServiceTest.testCreateArrayOfWords2();
        wordServiceTest.testCreateArrayOfWords3();

        wordServiceTest.testCountOfWords();
        wordServiceTest.testCountOfWords2();
        wordServiceTest.testCountOfWords3();

        wordServiceTest.testFindMostFrequentWordOneWord();
        wordServiceTest.testFindMostFrequentWordOneWord2();
        wordServiceTest.testFindMostFrequentWordOneWord3();

        wordServiceTest.testFull2Words();
        wordServiceTest.testFull1Word();
    }

    public void checkResultString(String name, String methodsResult, String expectedResult){
        if (methodsResult.equals(expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkResultArray(String name, String [] methodsResult, String [] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkResultArrayInt(String name, int [] methodsResult, int [] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkResultInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testCountNumberOfWords1(){
        WordService wordService = new WordService();
        checkResultInt("testCountNumberOfWords1", wordService.countNumberOfWordsInString("!Hello,!"), 1);
    }

    public void testCountNumberOfWords2(){
        WordService wordService = new WordService();
        checkResultInt("testCountNumberOfWords2", wordService.countNumberOfWordsInString("!Hello, Bobby!"), 2);
    }

    public void testCountNumberOfWords3(){
        WordService wordService = new WordService();
        checkResultInt("testCountNumberOfWords3", wordService.countNumberOfWordsInString("!Hello, Bobby! How are you?"), 5);
    }

    public void testCountNumberOfWords4(){
        WordService wordService = new WordService();
        checkResultInt("testCountNumberOfWords4", wordService.countNumberOfWordsInString("!Hello, Bobby! How are you? I'm fine."), 7);
    }

    public void testCreateArrayOfWords(){
        WordService wordService = new WordService();
        String [] expectedArray = {"Hello"};
        checkResultArray("testCreateArrayOfWords", wordService.createArrayOfWords("!Hello,? "), expectedArray);
    }

    public void testCreateArrayOfWords2(){
        WordService wordService = new WordService();
        String [] expectedArray = {"Hello", "Bobby"};
        checkResultArray("testCreateArrayOfWords2", wordService.createArrayOfWords("!Hello, Bobby!"), expectedArray);
    }

    public void testCreateArrayOfWords3(){
        WordService wordService = new WordService();
        String [] expectedArray = {"Hello", "Bobby", "How", "are", "you", "I'm", "fine"};
        checkResultArray("testCreateArrayOfWords3", wordService.createArrayOfWords("!Hello, Bobby! How are you? I'm fine."), expectedArray);
    }

    public void testCountOfWords(){
        WordService wordService = new WordService();
        String [] newArray = {"Hello", "Bobby"};
        int [] expectedArray = {1, 1};
        checkResultArrayInt("testCountOfWords", wordService.countOfWords(newArray), expectedArray);
        //System.out.println(Arrays.toString(wordService.countOfWords(newArray)));
    }

    public void testCountOfWords2(){
        WordService wordService = new WordService();
        String [] newArray = {"Hello", "Bobby", "Hello"};
        int [] expectedArray = {2, 1, 1};
        checkResultArrayInt("testCountOfWords2", wordService.countOfWords(newArray), expectedArray);
        //System.out.println(Arrays.toString(wordService.countOfWords(newArray)));
    }

    public void testCountOfWords3(){
        WordService wordService = new WordService();
        String [] newArray = {"Hello"};
        int [] expectedArray = {1};
        checkResultArrayInt("testCountOfWords3", wordService.countOfWords(newArray), expectedArray);
        //System.out.println(Arrays.toString(wordService.countOfWords(newArray)));
    }

    public void testFindMostFrequentWordOneWord(){
        WordService wordService = new WordService();

        String [] words = {"Hello", "me"};
        int [] countOfWords = {1, 1};
        checkResultString("testFindMostFrequentWordOneWord", wordService.findMostFrequentWord(words, countOfWords), "hello");
    }

    public void testFindMostFrequentWordOneWord2(){
        WordService wordService = new WordService();

        String [] words = {"hello", "me", "hello", "I", "me"};
        int [] countOfWords = {2, 2, 1, 1, 1};
        checkResultString("testFindMostFrequentWordOneWord", wordService.findMostFrequentWord(words, countOfWords), "hello");
    }

    public void testFindMostFrequentWordOneWord3(){
        WordService wordService = new WordService();

        String [] words = {"hello", "me", "ello", "frog", "me", "frog"};
        int [] countOfWords = {1, 2, 1, 2, 1, 1};
        checkResultString("testFindMostFrequentWordOneWord", wordService.findMostFrequentWord(words, countOfWords), "me");
    }

    public void testFull2Words(){
        WordService wordService = new WordService();
        String text = "]Hello, my little friend! Friend, how are you? Little?/";
        checkResultString("testFull2Words", wordService.wordServiceFull(text), "little");

    }

    public void testFull1Word(){
        WordService wordService = new WordService();
        String text = "]Hello/";
        checkResultString("testFull1Word", wordService.wordServiceFull(text), "hello");
    }

}
