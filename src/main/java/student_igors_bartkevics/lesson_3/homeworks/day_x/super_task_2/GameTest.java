package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_2;

class GameTest {

    public static void main(String[] args) {

        GameTest test = new GameTest();
        test.allStrikesTest();
        test.allSparesTest();
        test.regularGameTest();
    }

    public void checkResult(String testName, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
                System.out.println(testName + " = FAIL");
            }
        }

    public void allStrikesTest() {
        Game game = new Game();
        game.roll(10); //roll 1 frame 1
        game.roll(10); //roll 2 frame 2
        game.roll(10); //roll 3 frame 3
        game.roll(10); //roll 4 frame 4
        game.roll(10); //roll 5 frame 5
        game.roll(10); //roll 6 frame 6
        game.roll(10); //roll 7 frame 7
        game.roll(10); //roll 8 frame 8
        game.roll(10); //roll 9 frame 9
        game.roll(10); //roll 10 frame 10
        game.roll(10); //roll 11 frame 11
        game.roll(10); //roll 12 frame 12
        checkResult("All strikes test", game.score(), 300);
    }

    public void allSparesTest() {
        Game game = new Game();
        game.roll(1); //roll 1 frame 1
        game.roll(9); //roll 2 frame 1    +2
        game.roll(2); //roll 3 frame 2
        game.roll(8); //roll 4 frame 2    +3
        game.roll(3); //roll 5 frame 3
        game.roll(7); //roll 6 frame 3    +4
        game.roll(4); //roll 7 frame 4
        game.roll(6); //roll 8 frame 4    +5
        game.roll(5); //roll 9 frame 5
        game.roll(5); //roll 10 frame 5   +6
        game.roll(6); //roll 11 frame 6
        game.roll(4); //roll 12 frame 6   +7
        game.roll(7); //roll 13 frame 7
        game.roll(3); //roll 14 frame 7   +8
        game.roll(8); //roll 15 frame 8
        game.roll(2); //roll 16 frame 8   +9
        game.roll(9); //roll 17 frame 9
        game.roll(1); //roll 18 frame 9   +5
        game.roll(5); //roll 19 frame 10
        game.roll(5); //roll 20 frame 10
        game.roll(9); //roll 21 frame 10 bonus

        checkResult("All spares test", game.score(), 158);
    }

    public void regularGameTest() {
        Game game = new Game();
        game.roll(1); //roll 1 frame 1
        game.roll(3); //roll 2 frame 1
        game.roll(2); //roll 3 frame 2
        game.roll(7); //roll 4 frame 2
        game.roll(10); //roll 5 frame 3 +7+1
        game.roll(7); //roll 6 frame 4
        game.roll(1); //roll 7 frame 4
        game.roll(6); //roll 8 frame 5    +5
        game.roll(4); //roll 9 frame 5
        game.roll(5); //roll 10 frame 6
        game.roll(3); //roll 11 frame 6
        game.roll(4); //roll 12 frame 7
        game.roll(3); //roll 13 frame 7
        game.roll(3); //roll 14 frame 8
        game.roll(6); //roll 15 frame 8
        game.roll(2); //roll 16 frame 9
        game.roll(6); //roll 17 frame 9
        game.roll(1); //roll 18 frame 10
        game.roll(5); //roll 19 frame 10

        checkResult("Regular game test", game.score(), 92);
    }

}
