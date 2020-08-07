package student_volodya_danilin.lesson_7.level_1;

import java.util.Arrays;

public class WordService {

    public String findMostFrequentWord(String text) {
        String currentMostFrequent = "";
        int currentMaxCounter = 0;
        int newMaxCounter = 0;

        String[] textWord = text.trim().split("\\s+"); // splitting text into separate words

        int wordInTextCount = textWord.length; // how many words are in given text string

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

    private String stringForTests = "1   2 2   3 3 3   4 4 4 4   1 1 1";
    private WordService wordService;

    public static void main(String[] Args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        student_volodya_danilin.lesson_7.level_1.WordService wordService = new WordService();

        wordServiceTest.setWordService(wordService);
        wordServiceTest.shouldTestFindMostFrequentWord();
    }

    void shouldTestFindMostFrequentWord() {
        System.out.println("Given text: " + stringForTests);
        System.out.println("First most frequent word: " + wordService.findMostFrequentWord(this.stringForTests));

    }


    public void setWordService(WordService wordService) {
        this.wordService = wordService;
    }
}



