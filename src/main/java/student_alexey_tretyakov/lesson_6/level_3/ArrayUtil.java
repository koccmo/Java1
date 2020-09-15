package student_alexey_tretyakov.lesson_6.level_3;

import java.util.Random;

public class ArrayUtil {

    //private int[] inArray;
    //private int inNumber;

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] fillArrayWithRandomNumbers(int[] numbers) {
        Random random = new Random();
        int[] randomArray = new int[numbers.length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public void printArrayToConsole(int[] inArray) {
        System.out.print("Array = [ ");
        for (int i = 0; i < (inArray.length - 1); i++) {
            System.out.print(inArray[i] + ", ");
        }
        System.out.println(inArray[inArray.length - 1] + " ]");
    }

    public int findMaxNumber(int[] inArray) {
        int maxInt = inArray[0];
        for (int value : inArray) {
            if (value >= maxInt) maxInt = value;
        }
        return maxInt;
    }

    public int findMinNumber(int[] inArray) {
        int minInt = inArray[0];
        for (int value : inArray) {
            if (value <= minInt) minInt = value;
        }
        return minInt;
    }

    public void printEvenNumber(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] % 2 == 0) {
                System.out.println(" Чётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }

    public void printOddNumber(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] % 2 != 0) {
                System.out.println(" Нечётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }

    public boolean findEqualNumber(int[] inArray, int inNumber) {

        boolean findResult = false;
        int i = 0;
        do {
            if (inArray[i] == inNumber) {
                findResult = true;
                break;
            }
            i++;
        } while (i < inArray.length);
        return findResult;
    }

    public int findEqualNumberTimes(int[] inArray, int inNumber) {

        int timesNumber = 0;
        for (int element : inArray) {
            if (element == inNumber) timesNumber++;
        }
        return timesNumber;
    }

    public void replace(int[] inArray, int numberToReplace, int newNumber) {
        int i = 0;
        do {
            if (inArray[i] == numberToReplace) {
                inArray[i] = newNumber;
                break;
            }
            i++;
        } while (i < inArray.length);
    }

    public void replaceAll(int[] inArray, int numberToReplace, int newNumber) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] == numberToReplace) {
                inArray[i] = newNumber;
            }
        }
    }

    public int[] reverseArray(int[] inArray) {
        int j = inArray.length - 1;
        int[] newArray = new int[inArray.length];
        for (int value : inArray) {
            newArray[j] = value;
            j--;
        }
        return newArray;

    }

    public int[] resortArrayIncrease( int[] inArray ) {

        int bubble = inArray[0];
        int i = 0;
        while (i < inArray.length) {
            i++;
            for (int j = i; j < inArray.length; j++) {
                if (inArray[j] > bubble) {
                    bubble = inArray[j];
                } else {
                    inArray[j - 1] = inArray[j];
                    inArray[j] = bubble;
                }
            }
            if (i < inArray.length) {
                bubble = inArray[i];
            }
        }
        return inArray;

    }

    public int[] resortArrayDecrease( int[] inArray ) {
        ArrayUtil sortArray = new ArrayUtil();
        inArray = sortArray.resortArrayIncrease( inArray );
        inArray = sortArray.reverseArray( inArray );
        return inArray;
    }




    public static void main(String[] args) {
       ArrayUtil newArray = new ArrayUtil();
       int[] myArray = {1,3,5,13,25,9,8,15,12,41};
        newArray.printArrayToConsole( myArray );
        myArray = newArray.resortArrayDecrease(myArray);
        newArray.printArrayToConsole( myArray );
        //myArray = newArray.reverseArray(myArray);
        //newArray.printArrayToConsole(myArray);

    }

}

