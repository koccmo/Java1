package student_jaroslav_brutan.lesson_13.day_4;

import java.util.concurrent.TimeUnit;

public class GameOfLife {

    private GameOfLifeConsoleUI gameOfLifeConsoleUI = new GameOfLifeConsoleUIImpl();
    private GameOfLifeRandomFieldGenerator gameOfLifeRandomFieldGenerator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    public void run(){
        boolean[][] field = gameOfLifeRandomFieldGenerator.generate(10, 10);
        while (true){
            gameOfLifeConsoleUI.show(field);
            sleep(5);
            field = gameOfLifeNextGenerationCalculator.calculate(field);
        }
    }

    private void sleep(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException exception){
            System.out.println("Exception!");
            System.exit(1);
        }
    }
}
