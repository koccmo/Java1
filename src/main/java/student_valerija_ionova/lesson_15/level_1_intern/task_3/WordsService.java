package student_valerija_ionova.lesson_15.level_1_intern.task_3;

//метод по подсчёту количества повторений указанного слова в массиве

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int countOfWordsRepetitions = 0;
        for (String currentWord : words) {
            if (currentWord.equals(repeatingWord)) {
                countOfWordsRepetitions++;
            }
        }
        return countOfWordsRepetitions;
    }

}
