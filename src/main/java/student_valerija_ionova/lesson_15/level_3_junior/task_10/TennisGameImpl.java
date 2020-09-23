package student_valerija_ionova.lesson_15.level_3_junior.task_10;

class TennisGameImpl implements  TennisGame{

    private String player1;
    private String player2;
    private int scoreOfPlayer1;
    private int scoreOfPlayer2;

    TennisGameImpl (String player1, String player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1)){
            scoreOfPlayer1++;
        }else{
            scoreOfPlayer2 ++;
        }
    }

    @Override
    public String score() {
        if (scoreOfPlayer1 > 4){
            if (scoreOfPlayer1 - scoreOfPlayer2 >= 2){
                return "Win " + player1;
            }
        }
        if (scoreOfPlayer2 >4){
            if (scoreOfPlayer2 - scoreOfPlayer1 >= 2){
                return "Win " + player2;
            }
        }
        if ((scoreOfPlayer1 >= 3) && (scoreOfPlayer2 >= 3)){
            if (scoreOfPlayer1 == scoreOfPlayer2) return "Deuce";
            if (scoreOfPlayer1 > scoreOfPlayer2) return "Advantage "+ player1;
            return "Advantage "+ player2;
        }else{
            return scoreNumberToScoreStringForSpecificPlayer(scoreOfPlayer1)+"-"
                    +scoreNumberToScoreStringForSpecificPlayer(scoreOfPlayer2);
        }
    }

    private String scoreNumberToScoreStringForSpecificPlayer (int number){
        if (number == 0) return "Love";
        if (number == 1) return "Fifteen";
        if (number == 2) return "Thirty";
        return "Forty";
    }
}
