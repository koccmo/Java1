package student_igors_bartkevics.lesson_13.homework.level_5_middle;

import java.util.List;

public class SplitterReplacer {

    public String replaceSplittersInStringWithUniqueSplitter(List<String> splitters, String string, String uniqueSplitter) {
        for (String splitter : splitters) {
            string = string.replace(splitter, uniqueSplitter);
        }
        return string;
    }
}
