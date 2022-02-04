package roman.lesson_7.homework.day_1.task_1;



import java.util.Arrays;
import java.util.HashMap;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.splitTest();
        test.wordCounterTest();
        test.fillUpMapTest();
        test.wordCounterAndPutNumbersInMapTest();
        test.returnMostRepetitiveWordTest();
        test.findMostFrequentWordTest1();


    }
    WordService check = new WordService();

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else System.out.println(nameOfTest + " Test - Fail!");
    }

    public void splitTest(){
        String text = "Hey my name";
        String[] expectedAnswer = new String[]{"Hey", "my", "name"};
        String nameOfTest = "Split Text";
        checkResult(Arrays.equals(expectedAnswer, check.splitText(text)), nameOfTest);
    }

    public void wordCounterTest() {
        int expectedAnswer = 3;
        String[] array = new String[]{"Hey", "my", "friend"};
        String nameOfTest = "World Counter";
        checkResult(expectedAnswer == check.wordCounter(array), nameOfTest);
    }

    public void fillUpMapTest() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hey", 0);
        map.put("ok", 0);
        HashMap<String, Integer> map2 = new HashMap<>();
        String[] arrayString = new String[] {"hey", "ok"};
        check.fillUpMapWithUserText(map2, arrayString);
        String nameOfTest = "Fill Up Map";
        checkResult(map.equals(map2), nameOfTest);
    }

    public void wordCounterAndPutNumbersInMapTest() {
        HashMap<String, Integer> expectedAnswer = new HashMap<>();
        expectedAnswer.put("hey", 1);
        expectedAnswer.put("ok", 1);
        String[] arrayString = new String[] {"hey", "ok"};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hey", 0);
        map.put("ok", 0);
        check.counterForRepeatAndPutNumbers(map, arrayString);
        String nameOfTest = "Word Counter And Put Numbers In Map Value";
        checkResult(expectedAnswer.equals(map), nameOfTest);

    }

    public void returnMostRepetitiveWordTest() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("haja", 2);
        map.put("hej", 2);
        map.put("my", 1);
        String expectedAnswer = "haja";
        String nameOfTest = "Most Repetitive Word Return";
        checkResult(expectedAnswer.equals(check.returnWordMostRepetitive(map)), nameOfTest);
    }

    public void findMostFrequentWordTest1() {
        String text = "Hello my hello my friend";
        String expectedAnswer = "hello";
        String nameOfTest = "Find Most Frequent Word 1";
        checkResult(expectedAnswer.equals(check.findMostFrequentWord(text)), nameOfTest);
    }
}
