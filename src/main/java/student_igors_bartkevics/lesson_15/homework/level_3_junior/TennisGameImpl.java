package student_igors_bartkevics.lesson_15.homework.level_3_junior;

class TennisGameImpl implements TennisGame {
    private Player player1;
    private Player player2;

    TennisGameImpl(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    @Override
    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.addPoint();
        }
        else {
            player2.addPoint();
        }
    }

    @Override
    public String score() {
        if (player1Won()) {
            return "Win " + player1.getName();
        }
        else if (player2Won()) {
            return "Win " + player2.getName();
        }
        else if (deuce()) {
            return "Deuce";
        }
        else if (player1Advantage()) {
            return "Advantage " + player1.getName();
        }
        else if (player2Advantage()) {
            return "Advantage " + player2.getName();
        }
        else return convertPlayerScoreToString(player1) + " - " + convertPlayerScoreToString(player2);
    }

    private boolean player1Won() {
        int scoreOfPlayer1 = player1.getScore();
        int scoreOfPlayer2 = player2.getScore();
        return ((scoreOfPlayer1 > 3) && (scoreOfPlayer1 - scoreOfPlayer2 == 2 ));
    }

    private boolean player2Won() {
        int scoreOfPlayer1 = player1.getScore();
        int scoreOfPlayer2 = player2.getScore();
        return ((scoreOfPlayer2 > 3) && (scoreOfPlayer2 - scoreOfPlayer1 == 2 ));
    }

    private boolean deuce() {
        int scoreOfPlayer1 = player1.getScore();
        int scoreOfPlayer2 = player2.getScore();
        return (scoreOfPlayer1 == scoreOfPlayer2 && scoreOfPlayer1 > 2);
    }

    private boolean player1Advantage() {
        int scoreOfPlayer1 = player1.getScore();
        int scoreOfPlayer2 = player2.getScore();
        return ((scoreOfPlayer1 > 2) && (scoreOfPlayer2 > 2) && (scoreOfPlayer1 - scoreOfPlayer2 == 1));
    }

    private boolean player2Advantage() {
        int scoreOfPlayer1 = player1.getScore();
        int scoreOfPlayer2 = player2.getScore();
        return ((scoreOfPlayer1 > 2) && (scoreOfPlayer2 > 2) && (scoreOfPlayer2 - scoreOfPlayer1 == 1));
    }

    private String convertPlayerScoreToString(Player player) {
        int playerScore = player.getScore();
        return switch (playerScore) {
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Love";
        };

    }

}
