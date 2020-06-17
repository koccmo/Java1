package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_2;

//Write a class Game that has two methods:
//- void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
//- int score() returns the total score for that game.

/*ArrayList.add(Object o); // Append the list
ArrayList.remove(int index); // Remove list[index]
ArrayList.remove(0); // Remove first element
ArrayList.add(int index, Object o); // Prepend the list*/

import java.util.Arrays;

public class Game {

    private int [] scoreOfRolls = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0, 0, 0, 0, 0};

    int count = 0;

    public Game(){

    }

    //- void roll(int) is called each time the player rolls a ball.
    // The argument is the number of pins knocked down.

    public void roll(int howMany){
    scoreOfRolls[count]=howMany;
    if ((howMany == 10)&&(count%2 == 0)) count++;
    count++;

    if ((count == 20)&&((scoreOfRolls[18]+scoreOfRolls[19]!=10))) count++;
    }

    public java.lang.String tableOfScore(){
        return Arrays.toString(scoreOfRolls);
    }

    //- int score() returns the total score for that game.
    public int score(){
        int sum = 0;
        for (int i = 0; i<21; i++){

            sum += scoreOfRolls[i];
            //System.out.println("i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
            if (i%2 != 0){
                if (scoreOfRolls[i-1] == 10 ) {
                    sum = sum + scoreOfRolls[i+1]+scoreOfRolls[i+2];
                    //System.out.println(" First if i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
                    }
                else
                if (scoreOfRolls[i]+scoreOfRolls[i-1] == 10){
                    sum+=scoreOfRolls[i+1];
                    //System.out.println(" Second if i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
                }
            }

        }
        return sum;
    }

}
