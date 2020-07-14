package student_vladislav_zagrebin.lesson_5.lessonExamples;

public class ArrayExample {

    public static void main(String[] args) {

        // 9, 3, 4, 6, ....

        int mark1 = 9;
        int mark2 = 3;
        int mark3 = 4;
        int mark4 = 6;

        //       |_|_|_|_|
        // index  0 1 2 3
        int[] marks = new int[4];

        // int - 4 byte; 4 * 4 = 16 byte
        // int - 1000000 * 4 = 4000000 byte
        // OutOfMemoryException - если не хватает RAM для создания массива

        // int -> 4 byte - new int[4] -> 4 * 4 = 16 byte RAM

        // |0|0|0|0|
        // printArrayToConsole(marks);

        marks[0] = 9;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 6;

        // marks[0] = 10; - ячейка массива это переменная! Можно менять значения!
        // если массив объявлен как int[] - то и вводится только int !

        int sum = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println(sum);

        // marks[4] = 0; java.lang.ArrayIndexOutOfBoundsException

        System.out.println("Array length = " + marks.length);



    }
}
