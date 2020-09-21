package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30;

import java.util.Set;

public class DelimiterReplacer {

    public String replaceDelimitersInStringWithUniqueDelimiter(Set<String> delimiters, String string, String uniqueDelimiter) {
        for (String delimiter : delimiters) {
            string = string.replace(delimiter, uniqueDelimiter);
        }
        return string;
    }
}
