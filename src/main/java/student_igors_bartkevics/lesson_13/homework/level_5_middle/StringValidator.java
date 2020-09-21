package student_igors_bartkevics.lesson_13.homework.level_5_middle;

import java.util.List;

public class StringValidator {

    public boolean stringContainsSplitters(String string, List<String> splitters) {
        for (String splitter : splitters) {
            if (string.contains(splitter)) {
                return true;
            }
        }
        return false;
    }

    public boolean stringStartsOrEndsWithAnyOfSplitter(String string, List<String> splitters) {
        for (String splitter : splitters) {
            if (stringStartsOrEndsWithSplitter(string,splitter)) {
                return true;
            }
        }
        return false;
    }

    private boolean stringStartsOrEndsWithSplitter(String string, String splitter) {
        return (string.startsWith(splitter) || string.endsWith(splitter));
    }

}
