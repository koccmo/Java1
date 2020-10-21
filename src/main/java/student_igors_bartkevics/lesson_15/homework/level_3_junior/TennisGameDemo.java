package student_igors_bartkevics.lesson_15.homework.level_3_junior;

class TennisGameDemo {
    public static void main(String[] args) {
        TennisGameImpl game = new TennisGameImpl("Igors", "Dagnija");
        System.out.println(game.score()); //game.score(); -> "Love - Love"
        game.wonPoint("Igors");
        System.out.println(game.score()); //game.score(); -> "Fifteen - Love"
        game.wonPoint("Igors");
        System.out.println(game.score()); //game.score(); -> "Thirty - Love"
        game.wonPoint("Igors");
        System.out.println(game.score()); //game.score(); -> "Forty - Love"
        game.wonPoint("Dagnija");
        System.out.println(game.score()); //game.score(); -> "Forty - Fifteen"
        game.wonPoint("Dagnija");
        System.out.println(game.score()); //game.score(); -> "Forty - Thirty"
        game.wonPoint("Dagnija");
        System.out.println(game.score()); //game.score(); -> "Deuce"
        game.wonPoint("Dagnija");
        System.out.println(game.score()); //game.score(); -> "Advantage player2"
        game.wonPoint("Dagnija");
        System.out.println(game.score()); //game.score(); -> "Win player2"
    }


}
