package student_aleksandra_maksimovic.lesson_15.level_4;

public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        String P1res = "";
        String P2res = "";

        if (P1point == P2point && P1point < 4) {
            score = getScore(P1point);
            score += "-All";
        }
        if (P1point==P2point && P1point>=3)
            score = "Deuce";

        if (P1point > 0 && P2point==0) {
            P1res = getScore(P1point);
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0) {
            P1res = "Love";
            P2res = getScore(P2point);
            score = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4) {
            P1res = getScore(P1point);
            P2res = getScore(P2point);
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4) {
            P1res = getScore(P1point);
            P2res = getScore(P2point);
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3) {
            score = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3) {
            score = "Advantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2) {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2) {
            score = "Win for player2";
        }
        return score;
    }

    private void P1Score() {
        P1point++;
    }

    private void P2Score() {
        P2point++;
    }

    private String getScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "ERROR";
        }
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
