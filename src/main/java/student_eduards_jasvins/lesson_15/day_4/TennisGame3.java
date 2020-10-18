package student_eduards_jasvins.lesson_15.day_4;

public class TennisGame3 implements TennisGame {

    private int player2Score;
    private int player1Score;
    private String p1N;
    private String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    @Override
    public String score() {
        String score;
        if (isPlayerScoreLessThanFour() && !(isPlayerSumScoreOverSix())) {
            String[] scoreResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = scoreResult[player1Score];
            return (isSameScore()) ? score + "-All" : score + "-" + scoreResult[player2Score];
        } else {
            if (isSameScore())
                return "Deuce";
            score = isFirstPlayerScoreBigger() ? p1N : p2N;
            return ((isFirstPlayerAdvantage())) ? "Advantage " + score : "Win for " + score;
        }
    }

    private boolean isPlayerScoreLessThanFour() { return player1Score < 4 && player2Score < 4; }

    private boolean isPlayerSumScoreOverSix() { return player1Score + player2Score == 6; }

    private boolean isFirstPlayerScoreBigger() { return player1Score > player2Score; }

    private boolean isSameScore() { return player1Score == player2Score; }

    private boolean isFirstPlayerAdvantage() {
     return (player1Score - player2Score) * (player1Score - player2Score) == 1; }

    @Override
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1Score += 1;
        else
            this.player2Score += 1;
    }
}
