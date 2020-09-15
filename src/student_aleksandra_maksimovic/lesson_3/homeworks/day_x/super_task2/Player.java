/*package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task2;

public class Player {

    private String name;

    private int totalScore;

    private Frame[] frames = new Frame[10];



    public Player(String name) {
        this.name = name;

        for (int i = 0; i < frames.length; i++) {
            frames[i] = new Frame();
        }
    }

    public void spin(int pins) {

        int downPins = getInput(pins); // input

        totalScore += downPins;


        frame.scores += downPins;


        for (int j = 0; j < i; j++) {
            Frame bonusFrame = frames[j];
            if (bonusFrame.bonusSpin > 0) {
                bonusFrame.scores += downPins;
                bonusFrame.bonusSpin--;
            }
        }


        int leftPins = wasPins - downPins;

        if (leftPins == 0) {

            if (spin == 0) {
                frame.strike = true;
                frame.bonusSpin = 2;
            } else {
                frame.spare = true;
                frame.bonusSpin = 1;
            }

            break;
        }
    }

    private int getInput(int pins) {
        return 3; // TODO:
    }


}
*/