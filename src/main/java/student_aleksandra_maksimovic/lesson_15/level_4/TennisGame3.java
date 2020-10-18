package student_aleksandra_maksimovic.lesson_15.level_4;

public class TennisGame3 implements TennisGame {

    private String player1Name;
    private String player2Name;

    private int player1Scores;
    private int player2Scores;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {

        if (player1Scores < 4 && player2Scores < 4 && !(player1Scores + player2Scores == 6)) {
            return scoreLessThen4();
        }

        if (player1Scores == player2Scores) {
            return scoreEquals();
        }

        return scoreMoreThen3();
    }

    private String scoreLessThen4() {
        String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String player1ScoreName = scoreNames[player1Scores];
        return (player1Scores == player2Scores) ? player1ScoreName + "-All" : player1ScoreName + "-" + scoreNames[player2Scores];
    }

    private String scoreEquals() {
        return "Deuce";
    }

    private String scoreMoreThen3() {
        String leadingPlayerName = player1Scores > player2Scores ? player1Name : player2Name;
        return ((player1Scores - player2Scores)*(player1Scores - player2Scores) == 1) ? "Advantage " + leadingPlayerName : "Win for " + leadingPlayerName;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1Scores += 1;
        else
            this.player2Scores += 1;

    }

}