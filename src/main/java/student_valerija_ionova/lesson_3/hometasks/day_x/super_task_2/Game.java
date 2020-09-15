package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_2;

//Write a class Game that has two methods:
//- void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
//- int score() returns the total score for that game.

/*ArrayList.add(Object o); // Append the list
ArrayList.remove(int index); // Remove list[index]
ArrayList.remove(0); // Remove first element
ArrayList.add(int index, Object o); // Prepend the list*/

import java.util.Arrays;

class Game {

    private int [] scoreOfRolls = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0, 0, 0, 0, 0, 0};

    int count = 0;

    public Game(){

    }

    public int getCount (){
        return count;
    }

    //- void roll(int) is called each time the player rolls a ball.
    // The argument is the number of pins knocked down.

    public void roll(int howMany){
        scoreOfRolls[count]=howMany;
        //System.out.println("scoreOfBalls[count] "+scoreOfRolls[count]);
    if ((howMany == 10)&&(count % 2 == 0)&&(count<18)) {
        count++;
        scoreOfRolls[count] = 11;
        //System.out.println("if ((howMany == 10)&&(count % 2 == 0)&&(count<18)) count scoreOfRolls[count]"+count+"  "+scoreOfRolls[count]);
    }


    if ((count == 19)&&(scoreOfRolls[18]+scoreOfRolls[19]!=10)&&(scoreOfRolls[18]!=10)) {
        count++;
        //System.out.println("(count == 19)&&(scoreOfRolls[18]+scoreOfRolls[19]!=10)&&(scoreOfRolls[18]!=10) " + count);
    }
        count++;
        //System.out.println("Count without if "+count);

    }

    public java.lang.String tableOfScore(){
        return Arrays.toString(scoreOfRolls);
    }

    //- int score() returns the total score for that game.
    public int score(){
        int sum = 0;
        for (int i = 0; i<18; i++){

            if (scoreOfRolls[i] != 11) sum += scoreOfRolls[i];
            //System.out.println("Score without bonuses i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
            if (i % 2 == 0) {
                if (scoreOfRolls[i] == 10) {
                    int twoBonuses = 2;
                    int countTwoBonuses = 1;
                    while (twoBonuses > 0) {
                        if (scoreOfRolls[i+countTwoBonuses] != 11){
                            sum += scoreOfRolls[i+ countTwoBonuses];
                            countTwoBonuses ++;
                            twoBonuses --;
                        }else countTwoBonuses++;
                        //System.out.println("Strike First if i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
                    }
                }
            }
                else
                if (scoreOfRolls[i]+scoreOfRolls[i-1] == 10){
                    int oneBonus = 1;
                    int countOneBonus = 1;
                    while (oneBonus > 0){
                        if (scoreOfRolls[i+countOneBonus] != 11){
                            sum += scoreOfRolls[i + countOneBonus];
                            oneBonus --;
                            countOneBonus ++;
                        }else countOneBonus ++;
                    }
                    //System.out.println("Spare Second if i= "+i+" score[i]= "+scoreOfRolls[i]+"  sum = "+sum);
                }


        }

        for (int i=18; i<21; i++){
            sum+=scoreOfRolls[i];
            //System.out.println("Score 18-20 sum = "+sum);
        }
        return sum;
    }

}
