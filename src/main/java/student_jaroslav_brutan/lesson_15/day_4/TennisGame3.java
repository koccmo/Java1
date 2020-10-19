package student_jaroslav_brutan.lesson_15.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGame3 implements TennisGame{

    private int firstPlayerScore;
    private int secondPlayerScore;
    private String firstPlayer;
    private String secondPlayer;

    public TennisGame3(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getScore(){
        String score;
        if (firstPlayerScore < 4 && secondPlayerScore < 4 && !(firstPlayerScore + secondPlayerScore == 6)){
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = p[firstPlayerScore];
            return (firstPlayerScore == secondPlayerScore) ? score + "-All" : score + "" + p[secondPlayerScore];
        } else {
            if (firstPlayerScore == secondPlayerScore)
                return "Deuce";
            String playerName = firstPlayerScore > secondPlayerScore ? firstPlayer : secondPlayer;
            return ((firstPlayerScore - secondPlayerScore) * (firstPlayerScore - secondPlayerScore) == 1) ? "Advantage"
                    + playerName : "Win for" + playerName;
        }
    }

    public void wonPoint(String playerName){
        if (playerName.equals(firstPlayer)){
            this.firstPlayerScore += 1;
        } else {
            this.secondPlayerScore += 2;
        }
    }
}
