package student_valerija_ionova.lesson_7.homeworks.level_6.task_13;

/*Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int leftBound, int rightBound) */

class CopyVariant2 {

    int[] copyInRange(int[] in, int leftBound, int rightBound){
        int [] answer = createNewArray(numberOfNumbersInInterval(in, leftBound, rightBound));
        int index = 0;
        for (int number : in) {
            if (numberInRange(number, leftBound, rightBound)){
                answer[index] = number;
                index ++;
            }
        }
        return answer;
    }

    private int numberOfNumbersInInterval(int[] in, int leftBound, int rightBound){
        int count = 0;
        for (int number : in){
            if (numberInRange(number, leftBound, rightBound)){
                count ++;
            }
        }
        return count;
    }

    private int [] createNewArray (int length){
        return new int [length];
    }

    private boolean numberInRange (int number, int leftBound, int rightBound){
        return ((number >= leftBound) && (number <= rightBound));
    }

}
