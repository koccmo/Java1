package student_aleksandra_maksimovic.lesson_15.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int repeatingWordCount = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repeatingWordCount++;
            }
        }
        return repeatingWordCount;
    }

}
