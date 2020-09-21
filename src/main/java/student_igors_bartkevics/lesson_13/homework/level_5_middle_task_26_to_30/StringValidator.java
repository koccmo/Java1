package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30;

import java.util.List;
import java.util.Set;

public class StringValidator {

    public boolean stringContainsDelimiters(String string, Set<String> delimiters) {
        for (String delimiter : delimiters) {
            if (string.contains(delimiter)) {
                return true;
            }
        }
        return false;
    }

    public boolean stringStartsOrEndsWithAnyOfDelimiter(String string, Set<String> delimiters) {
        for (String delimiter : delimiters) {
            if (stringStartsOrEndsWithDelimiter(string, delimiter)) {
                return true;
            }
        }
        return false;
    }

    private boolean stringStartsOrEndsWithDelimiter(String string, String delimiter) {
        return (string.startsWith(delimiter) || string.endsWith(delimiter));
    }

}
