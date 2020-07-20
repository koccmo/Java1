package student_alexey_tretyakov.lesson_6.level_3;

import java.util.Random;

public class ArrayUtil {

    //private int[] inArray;
    //private int inNumber;

    public int[] createArray(int arrayLength) {
        return new int[ arrayLength ];
    }

    public int[] fillArrayWithRandomNumbers( int[] numbers ) {
        Random random = new Random();
        int[] randomArray= new int [numbers.length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public void printArrayToConsole(int[] inArray) {
        System.out.print("Array = [ ");
        for (int i = 0; i < (inArray.length-1); i++) {
            System.out.print( inArray[i] + ", ");
        }
        System.out.println(inArray[inArray.length-1] + " ]");
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
        for (int i =0; i < inArray.length; i++) {
            if (inArray[i] % 2 == 0 ) {
                System.out.println(" Чётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }

    public void printOddNumber(int[] inArray) {
        for (int i =0; i < inArray.length; i++) {
            if (inArray[i] % 2 != 0 ) {
                System.out.println(" Нечётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }

    public boolean findEqualNumber(int[] inArray, int inNumber) {

        boolean findResult = false;
        int i =0;
        do  {
            if (inArray[i] == inNumber) {
                findResult = true;
                break;
            }
            i++;
        } while ( i < inArray.length );
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
        int i =0;
        do  {
            if (inArray[i] == numberToReplace) {
                inArray[i] = newNumber;
                break;
            }
            i++;
        } while ( i < inArray.length );
    }
    public void replaceAll(int[] inArray, int numberToReplace, int newNumber) {
        for(int i =0; i < inArray.length; i++ ){
            if ( inArray[i] == numberToReplace) { inArray[i] = newNumber;}
        }
    }

    public int[] reverseArray( int[] inArray ) {
        int j = inArray.length-1;
        int[] newArray = new int[inArray.length];
        for (int value : inArray) {
            newArray[j] = value;
            j--;
        }
        return newArray;

    }


    public static void main(String[] args) {
       ArrayUtil newArray = new ArrayUtil();
       //int[] myArray = newArray.createArray(10);
       int[] myArray = {1,3,5,3,5,9,5,15,5,11};
       // myArray = newArray.fillArrayWithRandomNumbers( myArray );
        newArray.printArrayToConsole( myArray );
        /*newArray.findEqualNumberTimes( myArray,5);
        System.out.println( newArray.findEqualNumberTimes( myArray, 3 ) );
        System.out.println( newArray.findEqualNumber( myArray, 3 ) );
        */
       // newArray.replaceAll(myArray,5,21);
        myArray = newArray.reverseArray(myArray);
        newArray.printArrayToConsole(myArray);
        /*for (int i = 0; i < myArray.length; i++) {
            //myArray[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + myArray[i]);
        }

         */
    }

}

