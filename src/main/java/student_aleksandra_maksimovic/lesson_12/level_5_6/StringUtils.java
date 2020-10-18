package student_aleksandra_maksimovic.lesson_12.level_5_6;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Tests? :)")
public class StringUtils {

	@CodeReviewComment(teacher = "Please learn about regular expressions. With regular expressions this checks will be more elegant.")
    public static boolean isEnglishOrNumericString(String string)
    {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean isNumber = c >= '0' && c <= '9';

            if (!isLetter && !isNumber) {
                return false;
            }
        }

        return true;
    }
}
