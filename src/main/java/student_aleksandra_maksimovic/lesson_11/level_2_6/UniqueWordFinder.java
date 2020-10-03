package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    public Set<String> find(String text) {
        return new HashSet<>(Arrays.asList(text.split(" ")));
    }
}
