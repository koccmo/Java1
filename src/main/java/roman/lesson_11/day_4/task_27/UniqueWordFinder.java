package roman.lesson_11.day_4.task_27;

import java.util.*;

public class UniqueWordFinder {
    String[] split(String text) {
        return text.split(" ");
    }

    Set<String> find(String text) {
        return new HashSet<>(Arrays.asList(split(text)));
    }
}

