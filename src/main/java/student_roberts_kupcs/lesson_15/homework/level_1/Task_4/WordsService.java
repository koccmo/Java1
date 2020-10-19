package student_roberts_kupcs.lesson_15.homework.level_1.Task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordsService {

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
