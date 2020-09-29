package student_valerija_ionova.lesson_16.level_5.variant_1;

/*Дан массив целых чисел и отдельно целое число, которое является целью.

Пример:

Input: array = [1, 2, 5, 8]  target = 7
Output: [1, 2]  или [2, 1]
array[1] + array[2] = 2 + 5 = 7
*/

class TwoSumProblem {

    int [] numbers;
    int targetNumber;

    TwoSumProblem (int [] numbers, int targetNumber){
        this.numbers = numbers;
        this.targetNumber = targetNumber;
    }

    int [] getIndexesOfAddendum(){
        int [] result = new int [2];

        for (int i = 0; i< numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == targetNumber){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

}
