package student_igors_bartkevics.lesson_7.homework.level_1_task_1_to_3;

import java.util.List;

class WordServiceTest {

    public static void main(String[] args ) {
        WordServiceTest test = new WordServiceTest();
        test.SelectWordsFromStringTest();
        //test.selectDifferentWordsFromListTest();
        test.findMostFrequentWordInListTest();
        test.findMostFrequentWordTest();
    }

    WordService wordService = new WordService();

    public void findMostFrequentWordTest() {
        String text = "One order all scale not, sense her gay style wrote. Incommode our not all ourselves residence";
        String expectedResult = "all";
        boolean condition = wordService.findMostFrequentWord(text).equals(expectedResult);
        checkResult(condition, "Find most frequent word met in String of text");
    }

    public void findMostFrequentWordInListTest() {
        List<String> wordsToSelectFrom = List.of("One", "order", "order", "all", "one", "not", "order", "all", "all");
        String expectedResult = "order";
        boolean condition = wordService.findMostFrequentWordInList(wordsToSelectFrom).equals(expectedResult);
        checkResult(condition,"Find most frequent word met in list");
    }

    public void SelectWordsFromStringTest() {
        List<String> expectedResult = List.of("One", "order", "all", "scale", "not", "sense", "her", "gay", "style",
                "wrote", "Incommode", "our", "not", "all", "ourselves", "residence");

        String text = "One order all scale not, sense her gay style wrote. Incommode our not all ourselves residence";

        List<String> words = wordService.selectWordsFromText(text);
        boolean condition = expectedResult.equals(words);
        checkResult(condition, "Select words from string");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    /*
    public void selectDifferentWordsFromListTest() {
        WordService wordService = new WordService();
        List<String> wordsToSelectFrom = List.of("One", "order", "order", "all", "one", "not", "all", "her", "order", "style");
        List<String> expectedResult = List.of("One", "order", "all", "one", "not", "her", "style");

        List<String> differentWords = wordService.selectDifferentWords(wordsToSelectFrom);
        boolean condition = expectedResult.equals(differentWords);
        //for (String word : differentWords) {
        //    System.out.println(word);
        //}
        checkResult(condition, "Select different words from string");
    }

     */
}
