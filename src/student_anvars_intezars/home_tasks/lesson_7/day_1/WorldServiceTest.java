package student_anvars_intezars.home_tasks.lesson_7.day_1;

import java.util.Arrays;

public class WorldServiceTest {

    public static void main(String[] args) {

        WorldServiceTest worldServiceTest = new WorldServiceTest();
        worldServiceTest.mostFrequentWordInTextTest();
    }

    public void mostFrequentWordInTextTest() {
        WordService wordService = new WordService();
        String text =("My name is Anvar. My name has muslim roots.");
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("My")) {
            System.out.println("Tes for finding most frequent word = OK");
        }
    }
}
