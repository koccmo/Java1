package student_alexey_tretyakov.lesson_3.day_2;

public class Task_10_2 {


        public static void main(String[] args) {
            // Определение длины строки s1 и s2.
            String s1 = "Я стану отличным программистом!";
            int len1 = s1.length();
            String s2 = "Я стану отличным разработчиком!";
            int len2 = s2.length();

            // Вывод на экран количества символов в каждой строке.
            System.out.println( "Длина строки \"Я стану отличным программистом!\": " + len1 + " символ.");
            System.out.println( "Длина строки \"Я стану отличным разработчиком!\": " + len2 + " символ.");
            boolean  result = s1.contentEquals(s2);
            System.out.println("Строка \n" + s1 +" \n не равна по содержанию строке\n" + s2 + "\n " + result);

            // Сравнение длин строк s1 и s2.
            if (len1 > len2){
                System.out.println( "\nСтрока \"Я стану отличным программистом!\" длинее строки \"Я стану отличным разработчиком!\".");
            }
            if (len1 < len2){
                System.out.println( "\nСтрока \"Я стану отличным программистом!\" короче строки \"Я стану отличным разработчиком!\".");
            }
            else {
                System.out.println( "\nСтроки \"Я стану отличным программистом!\" и \"Я стану отличным разработчиком!\" равны по длине.");
            }
        }

}
