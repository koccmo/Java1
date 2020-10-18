package student_dmitrijs_jasvins.lesson_15.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TennisGame {
    void wonPoint(String playerName);

    String getScore();
}
