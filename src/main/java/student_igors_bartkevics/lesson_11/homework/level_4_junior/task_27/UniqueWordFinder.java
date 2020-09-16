package student_igors_bartkevics.lesson_11.homework.level_4_junior.task_27;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        String[] words = splitTextOnWords(text);
        return new HashSet<>(Arrays.asList(words));
    }

    String[] splitTextOnWords(String text) {
        return text.split(" ");
    }

}
