package student_anvars_intezars.home_tasks.lesson_7.day_1;

import java.util.Arrays;

public class WorldServiceTest {

    public static void main(String[] args) {

        WorldServiceTest worldServiceTest = new WorldServiceTest();
        worldServiceTest.mostFrequentWordInTextTest();
        worldServiceTest.splitLineOfTextToWordsTest();
    }

    public void mostFrequentWordInTextTest() {
        WordService wordService = new WordService();
        String text = ("My name is Anvar. My name has muslim roots.");
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("My")) {
            System.out.println("Tes for finding most frequent word = OK");
        }
    }

    public void splitLineOfTextToWordsTest() {
        WordService wordService = new WordService();
        String text = ("I believe in programming");
        String[] result = wordService.getTextLineToArray(text);
        if ((result[0].equals("I")) && (result[1].equals("believe")) && (result[2].equals("in") && result[3].equals("programming"))) {
            //System.out.println(Arrays.toString(result));
            System.out.println("Test for splitting line of text to words = OK");
        }
        else {
            System.out.println("Test for splitting line of text to words = FAIL");
        }
    }
}

