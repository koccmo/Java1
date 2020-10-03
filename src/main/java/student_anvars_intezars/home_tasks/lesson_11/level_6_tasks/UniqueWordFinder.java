package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    private String[] words;
    private Set<String> uniqueWords = new HashSet<String>();

    Set<String> find(String text) {
        words = text.split("[\\W]+");
        for (int i = 0; i < words.length; i++) {
            uniqueWords.add(words[i]);
        }
        return uniqueWords;
    }
}
