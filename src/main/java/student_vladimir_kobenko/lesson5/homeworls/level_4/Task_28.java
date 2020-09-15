package student_vladimir_kobenko.lesson5.homeworls.level_4;
// - создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наименьшее число в массиве и выведети его на консоль.

import java.util.Random;

public class Task_28 {
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

        System.out.println("Наименьший элемент массива");

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]< min){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
