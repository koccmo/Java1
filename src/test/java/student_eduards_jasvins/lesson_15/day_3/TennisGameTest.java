package student_eduards_jasvins.lesson_15.day_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameTest {

    TennisGameImpl game = new TennisGameImpl("Bob", "Sandy");

    @Test
    public void loveLove() {
        assertEquals("Love-Love", game.score());
    }

    @Test
    public void fifteenLove() {
        game.wonPoint("Bob");
        assertEquals("Fifteen-Love", game.score());
    }

    @Test
    public void thirtyLove() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        assertEquals("Thirty-Love", game.score());
    }

    @Test
    public void fortyFifteen() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        assertEquals("Thirty-Fifteen", game.score());
    }

    @Test
    public void thirtyThirty() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("Thirty-Thirty", game.score());
    }

    @Test
    public void fortyThirty() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("Forty-Thirty", game.score());
    }

    @Test
    public void testDeuce() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("Deuce", game.score());
    }

    @Test
    public void testAdvantageBob() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("AdvantageBob", game.score());
    }

    @Test
    public void testWinBob() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("winBob", game.score());
    }

    @Test
    public void testWinSandy() {
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        game.wonPoint("Sandy");
        assertEquals("winSandy", game.score());
    }
}