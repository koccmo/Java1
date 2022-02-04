package roman.lesson_7.homework.day_6.task_13;

public class Copy {
    public static void main(String[] args) {
        Copy copy = new Copy();
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copied = copy.copyInRange(intArray, 2, 4);
        copy.printArray(copied);
    }

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int arrayIndex = (numberTo - numberFrom) +1;
        int[] copiedArray = new int[arrayIndex];
        int j = 0;
        for (int i = numberFrom; i < (numberTo +1); i++) {
            copiedArray[j] = in[i];
            j++;
        }
        return copiedArray;
    }

    public void printArray(int[] intArray) {
        for (int value : intArray) {
            System.out.println(value);
        }
    }
}
