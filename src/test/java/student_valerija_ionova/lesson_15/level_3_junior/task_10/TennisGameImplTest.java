package student_valerija_ionova.lesson_15.level_3_junior.task_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameImplTest {

    TennisGameImpl tennisGame = new TennisGameImpl("player1", "player2");

    @Test
    public void testLoveLove(){
        assertEquals("Love-Love", tennisGame.score());
    }

    @Test
    public void testFifteenLove(){
        tennisGame.wonPoint("player1");
        assertEquals("Fifteen-Love", tennisGame.score());
    }


    @Test
    public void testThirtyLove(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        assertEquals("Thirty-Love", tennisGame.score());
    }

    @Test
    public void testFortyFifteen(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        assertEquals("Thirty-Fifteen", tennisGame.score());
    }

    @Test
    public void testThirtyThirty(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        assertEquals("Thirty-Thirty", tennisGame.score());
    }

    @Test
    public void testFortyThirty(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        assertEquals("Forty-Thirty", tennisGame.score());
    }

    @Test
    public void testDeuce(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        assertEquals("Deuce", tennisGame.score());
    }

    @Test
    public void testAdvantagePlayer2(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        assertEquals("Advantage player2", tennisGame.score());
    }

    @Test
    public void testWinPlayer2(){
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        assertEquals("Win player2", tennisGame.score());
    }

}