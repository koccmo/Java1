package student_igors_bartkevics.lesson_13.homework.level_5_middle;

class StringCalculator {

    //Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
    //Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.

    int add(String numbers) {
        int result = 0;

        if (rule1_emptyString(numbers)) {
            result = 0;
        }
        else if (rule2_singleDigit(numbers)) {
            result = Integer.parseInt(numbers);
        }
        else if (rule3_twoDigitsSplitterIsComma(numbers)) {
            result = Integer.parseInt(numbers.substring(0,1)) + Integer.parseInt(numbers.substring(2));
        }
        return result;
    }

    boolean rule1_emptyString(String string) {
        return string.isEmpty();
    }

    boolean rule2_singleDigit(String string) {
        return ((string.length() == 1) && Character.isDigit(string.charAt(0)));
    }

    boolean rule3_twoDigitsSplitterIsComma(String string) {
        return ((string.length() == 3) && Character.isDigit(string.charAt(0)) &&
        Character.isDigit(string.charAt(2)) && (string.charAt(1) == ',') );
    }
    /*
    boolean isSingleNumber(String numbers) {
        if (numbers.isEmpty()) {
            return false;
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (!Character.isDigit(numbers.charAt(i)))
                return false;
        }
        return true;
    }

     */



    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add(""));
        System.out.println(calculator.add("2"));
        System.out.println(calculator.add("2,3"));
        System.out.println(calculator.add("2,b3"));
    }


}
