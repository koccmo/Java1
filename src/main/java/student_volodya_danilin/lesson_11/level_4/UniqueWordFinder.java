package student_volodya_danilin.lesson_11.level_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> result = new HashSet<>();
        String [] words = text.split("\\s+");
        Collections.addAll(result, words);
        return result;
    }
}
