package student_alexey_tretyakov.lesson_4.level_x.Super_Task_2;
// return true - если год високосный
// return false - если год обычный
// Если год не делится на 4, значит он обычный.
// Иначе надо проверить не делится ли год на 100.
// Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
// Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
// Если год делится на 400, то он високосный.
// Иначе год обычный.

public class LeapYear {

    public boolean isLeapYear( int year) {
        if ( (year % 100) == 0 ) {
            return (year % 400) == 0;
        }
        return (year % 4) == 0;

    }

    public static void main(String[] args) {
        LeapYear newLeapYear = new LeapYear();
        System.out.println(newLeapYear.isLeapYear(2020));
        System.out.println(newLeapYear.isLeapYear(2019));
        System.out.println(newLeapYear.isLeapYear(2000));
    }
}
