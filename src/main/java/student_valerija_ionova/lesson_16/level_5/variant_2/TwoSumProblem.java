package student_valerija_ionova.lesson_16.level_5.variant_2;

import java.util.HashMap;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoSumProblem {

    int [] numbers;
    int targetNumber;
    HashMap <Integer, Integer> numbersAndIntegers = new HashMap<>();

    TwoSumProblem (int [] numbers, int targetNumber){
        this.numbers = numbers;
        this.targetNumber = targetNumber;
    }

    int [] getIndexesOfAddendum(){
        int [] result = new int [2];
        for (int i = 0; i< numbers.length; i++){
            if (numbersAndIntegers.containsKey(targetNumber - numbers[i])){
                result[0] = numbersAndIntegers.get(targetNumber - numbers[i]);
                result[1] = i;
                break;
            }else{
                numbersAndIntegers.put(numbers[i], i);
            }
        }
        return result;
    }

}
