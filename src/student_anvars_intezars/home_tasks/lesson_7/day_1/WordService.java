package student_anvars_intezars.home_tasks.lesson_7.day_1;

import java.util.Arrays;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] readyText = getTextLineToArray(text);
        countWordsInText(readyText);

        return text;
    }


    public String[] getTextLineToArray(String text) {
        String[] lineOfTextToWords = text.split(" ");
        Arrays.sort(lineOfTextToWords);
        return lineOfTextToWords;
    }

    public String countWordsInText(String[] lineOfTextToWords) {
        int mostFrequentWord = 0;
        int count = 0;
        String word = lineOfTextToWords[0];
        String current = lineOfTextToWords[0];
        for (int i = 1; i < lineOfTextToWords.length; i++) {
            if (lineOfTextToWords[i].equals(current)) {
                count++;
            } else {
                count = 1;
                current = lineOfTextToWords[i];
            }
            if (mostFrequentWord < count) {
                mostFrequentWord = count;
                word = lineOfTextToWords[i];
            }
        }
        System.out.println("Most frequent word is " + word + ", found " + mostFrequentWord +" times in the text");
        return word;
    }

}

