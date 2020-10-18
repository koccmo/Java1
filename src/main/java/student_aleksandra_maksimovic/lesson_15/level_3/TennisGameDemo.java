package student_aleksandra_maksimovic.lesson_15.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGameDemo {
    public static void main(String[] args) {
        TennisGame game = new TennisGameImpl("player1", "player2");
        
        System.out.println(game.score());//  -> "Love - Love"
        game.wonPoint("player1");
        System.out.println(game.score()); // -> "Fifteen - Love"
        game.wonPoint("player1");
        System.out.println(game.score()); // -> "Thirty - Love"
        game.wonPoint("player1");
        System.out.println(game.score()); // -> "Forty - Love"
        game.wonPoint("player2");
        System.out.println(game.score()); // -> "Forty - Fifteen"
        game.wonPoint("player2");
        System.out.println(game.score()); // -> "Forty - Thirty"
        game.wonPoint("player2");
        System.out.println(game.score()); // -> "Deuce"
        game.wonPoint("player2");
        System.out.println(game.score()); // -> "Advantage player2"
        game.wonPoint("player2");
        System.out.println(game.score()); // -> "Win player2"
    }
}
