package student_valerija_ionova.lesson_7.homeworks.level_6.task_13;

/*Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int leftBound, int rightBound)*/

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
