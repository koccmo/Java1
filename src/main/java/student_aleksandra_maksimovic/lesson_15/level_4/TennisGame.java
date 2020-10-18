package student_aleksandra_maksimovic.lesson_15.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface TennisGame {
    void wonPoint(String playerName);
    String getScore();
}
