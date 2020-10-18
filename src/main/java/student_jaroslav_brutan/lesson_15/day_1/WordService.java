package student_jaroslav_brutan.lesson_15.day_1;

public class WordService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitionsCount = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitionsCount++;
            }
        }
        return repetitionsCount;
    }
}
