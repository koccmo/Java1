package student_igors_bartkevics.lesson_15.homework.level_4_junior;

public class TennisGame2 implements TennisGame {
    public int player1Score = 0;
    public int player2Score = 0;

    public String player1Result = "";
    public String player2Result = "";
    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String player) {
        if (player.equals("player1"))
            addPointToPlayer1();
        else
            addPointToPlayer2();
    }

    @Override
    public String score() {
        if (player1Score == player2Score) {
            return deuce(player1Score);
        }

        else if (advantageOfPlayer1()) {
            return "Advantage player1";
        }

        else if (advantageOfPlayer2()) {
            return "Advantage player2";
        }

        else if (player1Won()) {
            return "Win for player1";
        }
        else if (player2Won()) {
            return "Win for player2";
        }
        else {
            player1Result = getPlayerScore(player1Score);
            player2Result = getPlayerScore(player2Score);

            return player1Result + "-" + player2Result;
        }

    }

    private String deuce(int playerScore) {
        return switch (playerScore) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private String getPlayerScore(int playerScore) {
        switch(playerScore) {
            case 1 -> {return "Fifteen";}
            case 2 -> {return "Thirty";}
            case 3 -> {return "Forty";}
            default -> {return "Love"; }
        }
    }

    private void addPointToPlayer1() {
        player1Score++;
    }

    private void addPointToPlayer2() {
        player2Score++;
    }

    private boolean advantageOfPlayer1() {
        return (player1Score - player2Score) == 1 && player2Score >= 3;
    }

    private boolean advantageOfPlayer2() {
        return (player2Score - player1Score) == 1 && player1Score >= 3;
    }

    private boolean player1Won() {
        return player1Score >= 4 && (player1Score-player2Score) >= 2;
    }

    private boolean player2Won() {
        return player2Score>=4 && (player2Score-player1Score)>=2;
    }
}
