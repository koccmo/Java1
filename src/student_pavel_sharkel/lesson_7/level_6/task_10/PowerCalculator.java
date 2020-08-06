package student_pavel_sharkel.lesson_7.level_6.task_10;

class PowerCalculator {


    int intoPower(int number, int power) {
        int newNumber = number;
        for (int i = 2; i <= power; i++) {
            newNumber = newNumber * number;
        }
        return newNumber;
    }
}
