package student_valerija_ionova.lesson_13.level_5_middle.task_31_32;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringCalculatorUniversal {

    int addNumber (String numbers){
        List<Integer> numbersList= createListOfNumbers(numbers);
        int sum = 0;
        for (Integer number : numbersList){
            sum += number;
        }
        return sum;
    }

    int addDigit (String numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++){
            if (Character.isDigit(numbers.charAt(i))){
                sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
            }
        }
        return sum;
    }

    private List <Integer> createListOfNumbers(String text){

        List <Integer> numbers = new ArrayList<>();

        String number = "";
        for (int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
                number += text.charAt(i);
            }else{
                if (number.length() != 0) {
                    numbers.add(Integer.parseInt(number));
                    number = "";
                }
            }
        }
        if (number.length() != 0) numbers.add(Integer.parseInt(number));
        return numbers;
    }

}
