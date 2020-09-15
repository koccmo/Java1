package student_volodya_danilin.lesson_5.level_2;

//- создать массив целых чисел длиной 3,
// - заполнить каждую ячейку массива любым числом,
// - вывести значение каждой ячейки на консоль.

public class Task_10 {

    public static void main(String[] Args) {

        int[] integerArray = new int[3];
        for (int count = 0; count <= integerArray.length; count++) {
            integerArray[count] = (count + 1) * 7;
            System.out.println(integerArray[count]);
        }

    }
}
