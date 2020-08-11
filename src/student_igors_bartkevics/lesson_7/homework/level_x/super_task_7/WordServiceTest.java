package student_igors_bartkevics.lesson_7.homework.level_x.super_task_7;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.convertStringToWordArrayTest();
    }

    WordService wordService = new WordService();

    public void findMostFrequentWordTest() {
        String text = "Это текст просто текст просто просто";
        boolean condition = wordService.findMostFrequentWord(text).equals("просто");
        checkResult(condition, "Find most frequent word in text test");
    }

    public void convertStringToWordArrayTest() {
        String text = "Это текст просто текст просто просто";
        String[] expectedResult = {"Это", "текст", "просто", "текст", "просто", "просто"};
        String[] result = wordService.convertStringToWordArray(text);
        boolean condition = Arrays.equals(expectedResult, result);
        checkResult(condition, "Convert string to word array");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
