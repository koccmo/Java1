package student_aleksandra_maksimovic.lesson_4.level_x.task_2;
/*
Написать класс для определения високосный год или нет.

class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.
    }
}

Создать класс для тестов LeapYearTest
и покрыть тестами весь функционал класса LeapYear.
 */

public class LeapYear {
    public boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
