package student_jaroslav_brutan.lesson_16.day_5;

public class TwoSumProblem {

    int[] arrayNumbers;
    int targetNumber;

    public TwoSumProblem(int[] arrayNumbers, int targetNumber) {
        this.arrayNumbers = arrayNumbers;
        this.targetNumber = targetNumber;
    }

    int[] getSumOfTwoIndexNumbers(){
        int[] sumResult = new int[2];
        for (int i = 0; i < arrayNumbers.length; i++){
            for (int j = i+1; j < arrayNumbers.length; j++){
                if (arrayNumbers[i] + arrayNumbers[j] == targetNumber){
                    sumResult[0] = i;
                    sumResult[1] = j;
                    break;
                }
            }
        }
        return sumResult;
    }
}
