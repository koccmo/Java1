package student_jaroslav_brutan.lesson_11.day2_6.WordFinder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text){
        String[] words = text.split("");
        return new HashSet<>(Arrays.asList(words));
    }
}
