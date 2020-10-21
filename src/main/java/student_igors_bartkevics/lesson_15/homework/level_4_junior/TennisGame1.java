package student_igors_bartkevics.lesson_15.homework.level_4_junior;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score += 1;
        else
            player2Score += 1;
    }

    @Override
    public String score() {
        
        if (player1Score == player2Score) {
            return deuce();
        }
        
        else if (player1Score > 3 || player2Score > 3) {

            if (advantageOfPlayer1()) return "Advantage player1";
            else if (advantageOfPlayer2()) return "Advantage player2";
            else if (player1Won()) return "Win for player1";
            else return "Win for player2";
        }
        else return convertTemporaryScoreToString();
    }
    
    private String deuce() {
        return switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private boolean advantageOfPlayer1() {
        return player1Score - player2Score == 1;
    }

    private boolean advantageOfPlayer2() {
        return player1Score - player2Score == -1;
    }

    private boolean player1Won() {
        return player1Score - player2Score > 1;
    }

    private String convertTemporaryScoreToString() {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else { score += "-"; tempScore = player2Score;}
            switch (tempScore) {
                case 0 -> score += "Love";
                case 1 -> score += "Fifteen";
                case 2 -> score += "Thirty";
                case 3 -> score += "Forty";
            }
        }
        return score;
    }
}