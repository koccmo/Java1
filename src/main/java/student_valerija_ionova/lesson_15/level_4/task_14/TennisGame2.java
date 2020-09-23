package student_valerija_ionova.lesson_15.level_4.task_14;

class TennisGame2 implements TennisGame {
    public int player1score = 0;
    public int player2score = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String player) {
        if (player.equals(player1Name))
            player1score++;
        else
            player2score++;
    }

    public String getScore() {
        String score = "";

        if (someOneCanWinOrAdvantage()) {
            if (player1score > player2score) {
                score = player1OnTop();
            }

            if (player2score > player1score) {
                score = player2OnTop();
            }
        }

        if (isScoreEquals()){
            if (noOneCanWin()) {
                score = getScoreIfEqualsAndNoOneCanWin();
            }else{
                score = "Deuce";
            }
        }else
            if (player1score <= 3 && player2score <= 3) {

                score = getScoreForDefinedPlayer(player1score) + "-" + getScoreForDefinedPlayer(player2score);
            }

        return score;
    }

    private boolean isScoreEquals(){
        return (player1score == player2score);
    }

    private boolean noOneCanWin(){
        return (player1score < 3);
    }

    private boolean someOneCanWinOrAdvantage(){
        return (((player1score >= 4) && (player1score - player2score >= 2))
                || ((player2score >= 4) && (player2score - player1score >= 2))
                    || ((player1score >= 3) && (player2score >= 3)));
    }

    private String getScoreForDefinedPlayer (int playerScore){
        if (playerScore == 0)
            return "Love";
        if (playerScore == 1)
            return "Fifteen";
        if (playerScore == 2)
            return "Thirty";
        if (playerScore == 3)
            return "Forty";
        return "Not valid score";
    }

    private String getScoreIfEqualsAndNoOneCanWin(){
        if (player1score == 0)
            return "Love-All";
        if (player1score == 1)
            return "Fifteen-All";
        if (player1score == 2)
            return "Thirty-All";
        return "Not valid";
    }

    private String player1OnTop(){
        if (player1score >= 4 && (player1score - player2score) >= 2) {
            return "Win for player1";
        }else
            if (player2score >= 3) {
            return "Advantage player1";
        }
            return "Not valid";
    }

    private String player2OnTop(){
        if (player2score >= 4 && (player2score - player1score) >= 2) {
            return "Win for player2";
        }else
            if (player1score >= 3) {
            return "Advantage player2";
        }
        return "Not valid";
    }

}
