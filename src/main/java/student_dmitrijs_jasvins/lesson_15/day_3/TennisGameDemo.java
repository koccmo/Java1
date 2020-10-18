package student_dmitrijs_jasvins.lesson_15.day_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGameDemo {
    public static void main(String[] args) {
        TennisGame game = new TennisGameImpl("player1", "player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player1");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());
        game.wonPoint("player2");
        System.out.println(game.score());

    }
}
