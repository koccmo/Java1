package student_jaroslav_brutan.lesson_7.day_6.task_13;

public class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int[] array = new int[in.length];
        int j = 0;
        for (int i = 0; i < in.length; i++){
            if (in[i] >= numberFrom && in[i] <= numberTo){
                array[j] = in[i];
                j++;
            }
        }
        int [] arrayWithRangeNumbers = new int[j];
        for (int i = 0; i < arrayWithRangeNumbers.length; i++){
            arrayWithRangeNumbers[i] = array[i];
        }
        return arrayWithRangeNumbers;
    }
}
