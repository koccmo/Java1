package student_roberts_kupcs.lesson_4.homework.level_2;

import java.util.Random;

class ArrayLength12 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] myNum = new int[3];
        myNum[0] = rand.nextInt(10);
        myNum[1] = rand.nextInt(10);
        myNum[2] = rand.nextInt(10);

        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
    }
}
