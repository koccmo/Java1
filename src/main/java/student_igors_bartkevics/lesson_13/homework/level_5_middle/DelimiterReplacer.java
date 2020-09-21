package student_igors_bartkevics.lesson_13.homework.level_5_middle;

import java.util.List;

public class DelimiterReplacer {

    public String replaceDelimitersInStringWithUniqueDelimiter(List<String> delimiters, String string, String uniqueDelimiter) {
        for (String delimiter : delimiters) {
            string = string.replace(delimiter, uniqueDelimiter);
        }
        return string;
    }
}
