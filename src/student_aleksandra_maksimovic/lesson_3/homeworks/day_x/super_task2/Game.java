/*package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task2;

public class Game {


    public void run()
    {
        Player player = new Player("Demo");

        player.spin();

    }





    public static void main(String[] args) {

        Game game = new Game();
        game.run();









        Frame[] frames = new Frame[11];

        for (int i = 0; i < frames.length; i++) {
            frames[i] = new Frame();
        }



        for (int i = 0; i < frames.length; i++) {
            Frame frame = frames[i];

            int wasPins = 10;

            for (int spin = 0; spin < 2; spin++) {

                if (i > 9) {
                    boolean hasBonus = false;

                    for (int j = 0; j < i; j++) {
                        if (frames[j].bonusSpin > 0) {
                            hasBonus = true;
                            break;
                        }
                    }

                    if (!hasBonus)
                        break;
                }

                int downPins = 10; // input

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
        }








    }
}
*/