package student_valerija_ionova.lesson_7.homeworks.level_6.task_13;

/*Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int leftBound, int rightBound) - вернуть новый массив,
в который входят только те числа, который находятся в рамках границы включительно.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/

class Copy {

    int[] copyInRange(int[] in, int leftBound, int rightBound){
        int [] newArrayWithNumbers = new int [in.length];
        int j=0;
        for (int i=0; i<in.length; i++){
            if ((in[i] >= leftBound) && ( in[i]<=rightBound)){
                newArrayWithNumbers[j] = in[i];
                j++;
            }
        }
        int [] arrayWithNumbersOfRightLength = new int[j];
        for (int i=0; i<arrayWithNumbersOfRightLength.length; i++){
            arrayWithNumbersOfRightLength[i] = newArrayWithNumbers[i];
        }
        return arrayWithNumbersOfRightLength;
    }

}
