package student_jaroslav_brutan.lesson_15.day_4;

public class TennisGame1 implements TennisGame{

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String firstPlayer;
    private String secondPlayer;

    public TennisGame1(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void wonPoint(String playerName){
        if (playerName.equals(firstPlayer)) {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore(){
        String score = "";
        if (bothPlayerScoresAreEqual()){
            score = playersScoreIsEqual();
        } else if (whichPlayerCanWin()){
            score = scoreIfSomeoneWinsTheMatch();
        } else {
            score = whatsIsTheScoreOfTheGame();
        }
        return score;
    }

    private boolean bothPlayerScoresAreEqual(){
        return m_score1 == m_score2;
    }

    private boolean whichPlayerCanWin(){
        return (m_score1 >= 4 || m_score2 >= 4);
    }

    private String playersScoreIsEqual(){
        String score;
        switch (m_score1){
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private String scoreIfSomeoneWinsTheMatch(){
        int minusResult = m_score1-m_score2;
        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return "Win for player1";
        else return "Win for player2";
    }

    private String whatsIsTheScoreOfTheGame(){
        int tempScore;
        String score = "";
        for (int i=1; i<3; i++) {
            if (i==1) tempScore = m_score1;
            else { score+="-"; tempScore = m_score2;}
            switch(tempScore) {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }
}
