package student_eduards_jasvins.lesson_15.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int sumOfRepetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                sumOfRepetitions++;
            }
        }
        return sumOfRepetitions;
    }
}
