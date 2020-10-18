package student_jaroslav_brutan.lesson_13.day_5;

public class StringCalculator {

    int add (String numbers){
        String[] arrayWithNumbers = numbers.split(",");
        int sum = 0;
        if (numbers.equals("")){
            return 0;
        } else {
            for (String number : arrayWithNumbers){
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }


}
