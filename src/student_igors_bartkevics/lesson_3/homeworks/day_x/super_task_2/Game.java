/*
Bowling Game Kata

Bowling Rules
The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins.
The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two rolls.
The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first roll.
The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame.
However no more than three balls can be rolled in tenth frame.

Requirements
Write a class Game that has two methods:

- void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
- int score() returns the total score for that game.
*/
package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_2;

class Game {

    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins){
        rolls[currentRoll++] = pins;
    }

    public int score(){

        int score = 0;
        int roll_Index = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (rolls[roll_Index] == 10) {
                score += 10 + rolls[roll_Index + 1] + rolls[roll_Index + 2];    //strike
                roll_Index += 1;
            }
			else if ((rolls[roll_Index] + rolls[roll_Index + 1]) == 10) {    //spare
                score += 10 + rolls[roll_Index + 2];
                roll_Index += 2;
            }
            else {
                score +=  rolls[roll_Index] + rolls[roll_Index + 1];
                roll_Index += 2;
            }
        }
        return score;
    }
}