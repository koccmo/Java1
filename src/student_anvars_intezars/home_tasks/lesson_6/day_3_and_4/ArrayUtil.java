package student_anvars_intezars.home_tasks.lesson_6.day_3_and_4;

public class ArrayUtil {


    public int checkArrayLength(int[] array) {
        return array.length;
    }

    public int findTheSameNumber(int[] array) {
        int size = array.length;

        //Переменная для посчета сколько раз повторилась цифра
        int maxCount = 0;
        //Переменная maxCount для подсчета самой повторяющейся цифры
        int maxIndex = 0;

        for (int i = 0; i < size; i++) {
            //Обновим теперь индекс
            int index = array[i] % size;
            array[index] = array[index] + size;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] / size > maxCount) {
                maxCount = array[i] / size;
                maxIndex = i;
            }
        }
        //System.out.print("The most repeating number is " + maxIndex);
        //System.out.println(" and it repeated " + maxCount + " times");
        return maxIndex;
    }

    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[numberToReplace] = numberToReplace;
            }
            for (int j = 0; j < array.length; j++) {
                array[numberToReplace] = newNumber;
            }
        }

    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = numberToReplace;
            }
            for (int j = 0; j < array.length; j++) {
                if(array[j] == numberToReplace) {
                   array[j] = newNumber;
                }
            }

        }
    }

    public void reverse (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    // Для решения данного метода, я решил использовать метод сортировки
    // массива под названием "Bubble" - сравнивать соседние элементы
    // друг с другом, по парам. Данный метод оказался более понятным.
    public void sort (int[] array) {
        for (int i = array.length-1; i > 0; i--)
            for (int j = 0; j < i; j++){
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }






