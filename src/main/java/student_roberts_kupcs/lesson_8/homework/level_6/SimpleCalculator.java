package student_roberts_kupcs.lesson_8.homework.level_6;

//Varargs — это аргументы переменной длины: фича, которая появилась еще в JDK5.
// Varargs позволяют нам создавать методы с произвольным количеством аргументов.

class SimpleCalculator {
    public static int sum(int... numbers) {

        int result = 0;

        for (int i : numbers) {

            result += i;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(2, 9));
    }
}
