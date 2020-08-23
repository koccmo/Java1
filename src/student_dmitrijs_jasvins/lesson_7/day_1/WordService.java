package student_dmitrijs_jasvins.lesson_7.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordService {

    public String[] convertStringToArray(String text) {
        return text.split(" ");
    }

    public String findWord(String[] wordArray) {
        String finalWord = null;
        int maxCount = 0;
        for (String temp : wordArray) {
            int count = 0;
            for (String value : wordArray) {
                if (temp.equals(value)) {
                    count++;
                }
                if (count > maxCount) {
                    finalWord = temp;
                    maxCount = count;
                }
            }
        }
        return finalWord;
    }

    public String findMostFrequentWord(String text) {
        String[] wordArray = convertStringToArray(text);
        return findWord(wordArray);
    }
}
