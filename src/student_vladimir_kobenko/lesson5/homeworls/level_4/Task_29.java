package student_vladimir_kobenko.lesson5.homeworls.level_4;

import java.util.Random;

public class Task_29 {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLenght = random.nextInt(25);

        int[] array = new int[arrayLenght];

        System.out.println("Элементы массива");

        for (int i = 0; i < array.length; i++) {
            int arrayElement = random.nextInt(100);
            array[i] = arrayElement;
            System.out.println(array[i]);

        }

        System.out.println("Чётные элементы массива");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);

            }

        }

    }
}
