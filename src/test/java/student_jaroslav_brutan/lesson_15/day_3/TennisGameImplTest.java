package student_jaroslav_brutan.lesson_15.day_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameImplTest {

    TennisGameImpl tennisGame = new TennisGameImpl("firstPlayer", "secondPlayer");

    @Test
    public void loveLoveTest(){
        assertEquals("Love-Love", tennisGame.score());
    }

    @Test
    public void thirtyLoveTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Thirty - love", tennisGame.score());
    }

    @Test
    public void fifteenLoveTest(){
        tennisGame.wonPoint("firstPlayer");
        assertEquals("Fifteen - love", tennisGame.score());
    }

    @Test
    public void fortyFifteenTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Thirty - fifteen", tennisGame.score());
    }

    @Test
    public void doubleThirtyTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Thirty - thirty", tennisGame.score());
    }

    @Test
    public void fortyThirtyTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Forty - thirty", tennisGame.score());
    }

    @Test
    public void deuceTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Deuce", tennisGame.score());
    }

    @Test
    public void secondPlayerAdvantageTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("Second player in advantage!", tennisGame.score());
    }

    @Test
    public void secondPlayerWinsTest(){
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("firstPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        tennisGame.wonPoint("secondPlayer");
        assertEquals("SecondPlayer wins!", tennisGame.score());
    }

}