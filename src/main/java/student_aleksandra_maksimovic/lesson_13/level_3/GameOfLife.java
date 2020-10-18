package student_aleksandra_maksimovic.lesson_13.level_3;

import java.util.concurrent.TimeUnit;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private FieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        System.out.println("LIVE!");
        Field field = generator.generate(120, 60);
        while(true) {
            ui.show(field);
            sleepForSeconds(1);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }




    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }

}
