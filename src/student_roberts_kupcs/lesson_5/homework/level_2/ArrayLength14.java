package student_roberts_kupcs.lesson_5.homework.level_2;

import java.util.Random;

class ArrayLength14 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] myNum = new int[3];
        myNum[0] = rand.nextInt(20);
        myNum[1] = rand.nextInt(20);
        myNum[2] = rand.nextInt(20);

        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);

        float average = 0;

        for (int i = 0; i < myNum.length; i++) {
            average = average + myNum[i];
        }
        average = average / myNum.length;
        System.out.println("среднее значение элементов массива равна= " + average);

    }
}
