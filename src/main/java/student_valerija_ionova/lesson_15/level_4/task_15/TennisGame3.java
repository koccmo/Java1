package student_valerija_ionova.lesson_15.level_4.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGame3 implements TennisGame {


    private int firstPlayerScore;
    private int secondPlayerScore;
    private String firstPlayerName;
    private String secondPlayerName;

    public TennisGame3(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        String score;

        if (firstPlayerScore < 4 && secondPlayerScore < 4 && !(firstPlayerScore + secondPlayerScore == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = p[firstPlayerScore];
            return (firstPlayerScore == secondPlayerScore) ? score + "-All" : score + "-" + p[secondPlayerScore];
        } else {
            if (firstPlayerScore == secondPlayerScore)
                return "Deuce";
            String playerName = firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
            return ((firstPlayerScore-secondPlayerScore)*(firstPlayerScore-secondPlayerScore) == 1) ? "Advantage "
                    + playerName : "Win for " + playerName;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(firstPlayerName))
            this.firstPlayerScore += 1;
        else
            this.secondPlayerScore += 1;
    }

}
