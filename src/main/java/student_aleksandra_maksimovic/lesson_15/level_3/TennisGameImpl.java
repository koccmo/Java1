package student_aleksandra_maksimovic.lesson_15.level_3;

import java.util.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Can not approve without tests! Demo not count!")
public class TennisGameImpl implements TennisGame {

	@CodeReviewComment(teacher = "Why List used here? Tennis game have only two players!"
			+ "They can be defined separately, without List usage.")
    List<String> players;

    Map<String, Integer> playerScores;

    public TennisGameImpl(String player1, String player2) {
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        playerScores = new HashMap<>();
        playerScores.put(player1, 0);
        playerScores.put(player2, 0);
    }

    @Override
    public void wonPoint(String playerName) {
        playerScores.put(playerName, playerScores.get(playerName) + 1);
    }

    @Override
    public String score() {
        /*
        - Гейм в тенисе выигрывает тот игрок, кто первым наберёт
          минимум четыре очка, при этом у него должно быть на два
          очка больше чем у противника.
        - Очки в тенисном гейме описываются следующим образом:
          очки от нуля до трёх - "Love", "Fifteen", "Thirty", and "Forty"
          соответственно.
        - Если оба игрока набрали хотя бы по три очка каждый
          и у обоих игроков одинаковое количество очков,
          то результат "Deuce".
        - Если оба игрока набрали хотя бы по три очка каждый
          и один из игроков набрал на одно очко больше другого,
          то результат игры "Advantage" в пользу игрока с наибольшим
          количеством очков.
         */

        Optional<String> winner = isPlayerWinner();
        if (winner.isPresent()) {
            return "Win for " + winner.get();
        }

        if (isDeuce()) {
            return "Deuce";
        }

        Optional<String> advantage = isPlayerAdvantage();
        if (advantage.isPresent()) {
            return "Advantage " + advantage.get();
        }

        List<String> scores = getPlayersScores();
        return scores.get(0) + "-" + scores.get(1);
    }


    private Optional<String> isPlayerWinner() {
        int player1Scores = playerScores.get(players.get(0));
        int player2Scores = playerScores.get(players.get(1));

        if ((player1Scores >= 4 || player2Scores >= 4) && Math.abs(player1Scores - player2Scores) >= 2) {
            return Optional.of(player1Scores > player2Scores ? players.get(0) : players.get(1));
        }

        return Optional.empty();
    }

    private boolean isDeuce() {
        int player1Scores = playerScores.get(players.get(0));
        int player2Scores = playerScores.get(players.get(1));

        return player1Scores >= 3 && player2Scores >= 3 && player1Scores == player2Scores;
    }

    private Optional<String> isPlayerAdvantage() {
        int player1Scores = playerScores.get(players.get(0));
        int player2Scores = playerScores.get(players.get(1));

        if (player1Scores >= 3 && player2Scores >= 3 && Math.abs(player1Scores - player2Scores) > 0) {
            return Optional.of(player1Scores > player2Scores ? players.get(0) : players.get(1));
        }

        return Optional.empty();
    }

    private String getPlayerScoreName(int score) {
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

    private List<String> getPlayersScores() {
        List<String> result = new ArrayList<>();

        for (String player : players) {
            int playerScore = playerScores.get(player);
            result.add(getPlayerScoreName(playerScore));
        }

        return result;
    }
}
