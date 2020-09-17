package student_valerija_ionova.lesson_13.level_5_middle.Task_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Task30 Дайте возможность методу add() принимать строку с числами разделёнными не
//только запятой, но и символом новой строки: "\n".
//  Работает с любыми разными разделителями!!! :)

class StringCalculatorUniversalSplit {

    int add (String numbers){
        List<Integer> numbersList= createListOfNumbers(numbers);
        //System.out.println(Arrays.toString(arrayOfNumber));
        int sum = 0;
        for (Integer number : numbersList){
                sum += number;
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