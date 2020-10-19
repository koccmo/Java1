package student_jaroslav_brutan.lesson_15.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface TennisGame {

    void wonPoint(String playerName);
    String getScore();
}
