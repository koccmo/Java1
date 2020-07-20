package student_anvars_intezars.home_tasks.lesson_6.day_3;

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






}




