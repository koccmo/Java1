package student_roberts_kupcs.lesson_15.homework.level_1.Task_3;

class WordsService {

    public int countRepetitions(String[] words, String wordRepetitionsNeedToCounted) {
        int numberOfRepetitions = 0;
        for (String word : words) {
            if (word.equals(wordRepetitionsNeedToCounted)) {
                numberOfRepetitions++;
            }
        }
        return numberOfRepetitions;
    }
}
