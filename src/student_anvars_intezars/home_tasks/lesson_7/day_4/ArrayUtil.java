package student_anvars_intezars.home_tasks.lesson_7.day_4;

public class ArrayUtil {


    public int checkArrayLength(int[] array) {
        return array.length;
    }

    public int findTheSameNumber(int[] array) {
        int size = array.length; int maxCount = 0;int maxIndex = 0;

        for (int i = 0; i < size; i++) {
            int index = array[i] % size;
            array[index] = array[index] + size;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] / size > maxCount) {
                maxCount = array[i] / size; maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[numberToReplace] = numberToReplace;
            }
            for (int j = 0; j < array.length; j++) { array[numberToReplace] = newNumber;
            }
        }

    }

    public void replaceAllElementsInArray(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = numberToReplace;
            }
            for (int j = 0; j < array.length; j++) {
                if(array[j] == numberToReplace) { array[j] = newNumber;
                }
            }

        }
    }

    public void reverseElementsInArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1]; array[array.length - i - 1] = tmp;
        }
    }

    public void sortByUsingBubbleMethod(int[] array) {
        for (int i = array.length-1; i > 0; i--)
            for (int j = 0; j < i; j++){
                if (array[j] > array[j + 1]) {
                    int tmp = array[j]; array[j] = array[j + 1]; array[j + 1] = tmp;
                }
            }
        }
    }






