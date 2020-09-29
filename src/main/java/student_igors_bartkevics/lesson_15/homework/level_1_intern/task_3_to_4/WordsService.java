package student_igors_bartkevics.lesson_15.homework.level_1_intern.task_3_to_4;

class WordsService {

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