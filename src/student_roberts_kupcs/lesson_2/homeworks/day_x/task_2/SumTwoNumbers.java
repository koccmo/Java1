package student_roberts_kupcs.lesson_2.homeworks.day_x.task_2;

class SumTwoNumbers {
    public static void main(String[] args) {
        int numberOne = 1;  //Обращение к локальным переменным должно быть выполнено только после того, как они будут
        // инициализированы
        int numberTwo = 2;  //Обращение к локальным переменным должно быть выполнено только после того, как они будут
        // инициализированы

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        numberOne = 10; //Переменная 'numberOne' уже определена в области видимости
        numberTwo = 20; //Переменная 'numberOne' уже определена в области видимости
        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }
}
