package student_volodya_danilin.lesson_7.level_1;

import java.util.Arrays;

public class WordService {

    public String findMostFrequentWord(String text) {
        String currentMostFrequent = "";
        int currentMaxCounter = 0;
        int newMaxCounter = 0;

        String[] textWord = text.trim().split("\\s+");

        int wordInTextCount = textWord.length;

        for (int i = 0; i < wordInTextCount; i++) { // choosing a word to check
            for (int j = 0; j < wordInTextCount; j++) { // comparing chosen word with each word in text
                if (textWord[i].equals(textWord[j])) {
                    newMaxCounter++;
                    if (currentMaxCounter < newMaxCounter) {
                        currentMostFrequent = textWord[i];
                        currentMaxCounter = newMaxCounter;
                    }
                }
            }
            newMaxCounter = 0;
        }
        return currentMostFrequent;
    }
}

class WordServiceTest {

    private static Object WordService;
    private String stringForTests = "1   2 2   3 3 3   4 4 4 4   1 1 1";
    private WordService wordService;

    public static void main(String[] Args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        student_volodya_danilin.lesson_7.level_1.WordService wordService = new WordService();

        wordServiceTest.setWordService(wordService);
        wordServiceTest.shouldTestFindMostFrequentWord();
    }

    void shouldTestFindMostFrequentWord() {
        System.out.print(wordService.findMostFrequentWord(this.stringForTests));

    }


    public void setWordService(WordService wordService) {
        this.wordService = wordService;
    }
}



