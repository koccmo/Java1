package student_eduards_jasvins.lesson_7.day_1;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordService {

    public String findMostFrequentWord(String text) {
            String[] textArray = text.split(" ");
            Arrays.sort(textArray);

            int wordCounter = 0;
            int count = 0;
            String word = textArray[0];
            String curr = textArray[0];
            for (int i = 0; i < textArray.length; i++) {
                    if (textArray[i].equals(curr)) {
                        count++;
                    }
                    else {
                    count = 1;
                    curr = textArray[i];
                    }

                    if (wordCounter < count) {
                        wordCounter = count;
                        word = textArray[i];
                    }
            }
        System.out.println("Most frequent word is '" + word + "' and mentioned in the text " + wordCounter + " times." );
            return word;
        }
}
