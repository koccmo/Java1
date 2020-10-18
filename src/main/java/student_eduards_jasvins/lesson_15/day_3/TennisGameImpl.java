package student_eduards_jasvins.lesson_15.day_3;

public class TennisGameImpl implements  TennisGame {

    private String player1;
    private String player2;
    private int player1Score;
    private int player2Score;

    TennisGameImpl(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }



    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    @Override
    public String score() {
       if (player1Score > 4) {
           if (player1Score - player2Score >= 2) {
               return "win" + player1;
           }
       }
       if (player2Score > 4) {
           if (player2Score - player1Score >= 2)
               return "win" + player2;
       }
       if ((player1Score >= 3) && (player2Score >= 3)) {
           if (player1Score == player2Score) return "Deuce";
           if (player1Score > player2Score) return "Advantage" + player1;
           return "Advantage" + player2;
       } else {
           return numberOfScoreForPlayer(player1Score)+ "-" + numberOfScoreForPlayer(player2Score);
       }
    }

    private String numberOfScoreForPlayer(int number) {
        if (number == 0) return "Love";
        if (number == 1) return "Fifteen";
        if (number == 2) return "Thirty";
        return "Forty";
    }

}
