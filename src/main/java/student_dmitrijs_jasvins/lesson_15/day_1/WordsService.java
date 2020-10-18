package student_dmitrijs_jasvins.lesson_15.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordsService {
    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }
}
