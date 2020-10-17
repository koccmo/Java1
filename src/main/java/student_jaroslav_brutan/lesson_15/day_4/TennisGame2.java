package student_jaroslav_brutan.lesson_15.day_4;

public class TennisGame2 implements TennisGame{

    public int firstPlayerScore = 0;
    public int secondPlayerScore = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String player){
        if (player.equals(player1Name)){
            firstPlayerScore++;
        } else {
            secondPlayerScore++;
        }
    }

    public String getScore(){
        String score = "";
        if (winOrAdvantage()){
            if (firstPlayerScore > secondPlayerScore){
                score = firstPlayerWins();
            } if (secondPlayerScore > firstPlayerScore){
                score = secondPlayerWins();
            }
        } if (sameScore()){
            if (theresNoWinner()){
                score = scoreIfEqualScoreAndNoWin();
            } else {
                score = "Deuce";
            }
        } else if (firstPlayerScore <= 3 && secondPlayerScore <= 3){
                score = concretePlayerScore(firstPlayerScore) + "" + concretePlayerScore(secondPlayerScore);
            }
            return score;
    }

    private boolean sameScore(){
        return (firstPlayerScore == secondPlayerScore);
    }

    private boolean theresNoWinner(){
        return (firstPlayerScore < 3);
    }

    private boolean winOrAdvantage(){
        return (((firstPlayerScore >= 4) && (firstPlayerScore - secondPlayerScore >= 2))
                || ((secondPlayerScore >=4) && (secondPlayerScore - firstPlayerScore >= 2))
                || ((firstPlayerScore >= 3) && (secondPlayerScore >= 3)));
    }

    private String concretePlayerScore(int playerScore){
        if (playerScore==0)
            return "Love";
        if (playerScore==1)
            return "Fifteen";
        if (playerScore==2)
            return "Thirty";
        if (playerScore == 3)
            return "Forty";
        return "-All";
    }

    private String scoreIfEqualScoreAndNoWin(){
        if (firstPlayerScore==0)
            return "Love";
        if (firstPlayerScore==1)
            return "Fifteen";
        if (firstPlayerScore==2)
            return "Thirty";
        return "-All";
    }

    private String firstPlayerWins(){
        if (firstPlayerScore >= 4 && (firstPlayerScore - secondPlayerScore) >= 2){
            return "First player wins!";
        } else if (secondPlayerScore >= 3){
            return "First player in advantage!";
        }
        return "-All";
    }

    private String secondPlayerWins(){
        if (secondPlayerScore >= 4 && (secondPlayerScore - firstPlayerScore) >= 2){
            return "Second player wins!";
        } else if (firstPlayerScore >= 3){
            return "Second player in advantage!";
        }
        return "-All";
    }
}
