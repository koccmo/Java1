package student_igors_bartkevics.lesson_15.homework.level_4_junior;



class TennisGameImpl implements TennisGame {
    private int player1Score;
    private int player2Score;
    private final String player1Name;
    private final String player2Name;

    TennisGameImpl(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (player1Name.equals(playerName)) {
            player1Score ++;
        }
        else {
            player2Score ++;
        }
    }

    @Override
    public String score() {
        if (player1Won()) {
            return "Win for " + player1Name;
        }
        else if (player2Won()) {
            return "Win for " + player2Name;
        }
        else if (allSame()) {
            return convertPlayerScoreToString(player1Score) + "-All";
        }
        else if (deuce()) {
            return "Deuce";
        }
        else if (player1Advantage()) {
            return "Advantage " + player1Name;
        }
        else if (player2Advantage()) {
            return "Advantage " + player2Name;
        }
        else return convertPlayerScoreToString(player1Score) + "-" + convertPlayerScoreToString(player2Score);
    }

    private boolean player1Won() {
        return ((player1Score > 3) && (player1Score - player2Score > 1 ));
    }

    private boolean player2Won() {
        return ((player2Score > 3) && (player2Score - player1Score > 1 ));
    }

    private boolean allSame() {
        return (player1Score == player2Score && player1Score < 3);
    }

    private boolean deuce() {
        return (player1Score == player2Score && player1Score > 2);
    }

    private boolean player1Advantage() {
        int scoreOfPlayer1 = player1Score;
        int scoreOfPlayer2 = player2Score;
        return ((scoreOfPlayer1 > 2) && (scoreOfPlayer2 > 2) && (scoreOfPlayer1 - scoreOfPlayer2 == 1));
    }

    private boolean player2Advantage() {
        int scoreOfPlayer1 = player1Score;
        int scoreOfPlayer2 = player2Score;
        return ((scoreOfPlayer1 > 2) && (scoreOfPlayer2 > 2) && (scoreOfPlayer2 - scoreOfPlayer1 == 1));
    }

    private String convertPlayerScoreToString(int playerScore) {
        return switch (playerScore) {
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Love";
        };

    }

}
