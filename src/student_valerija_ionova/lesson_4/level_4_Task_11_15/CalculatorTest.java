package student_valerija_ionova.lesson_4.level_4_Task_11_15;

/*Task12
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Test13 Добавьте в класс CalculatorTest тесты для этого метода.

Task14 Добавьте в класс CalculatorTest тесты для этого метода.
}*/

public class CalculatorTest {
    public static void main(String[] args){

        Calculator calculator = new Calculator();


        //Test of method sum
        if (calculator.sum(3, 5) == 8){
            System.out.println("Method sum is working good");
        } else System.out.println("Method sum isn't working");

        //Test of method substract
        if (calculator.substract(10, 4) == 6){
            System.out.println("Method substract is working good");
        } else System.out.println("Method substract isn't working");

        //Test of method multiply
        if (calculator.multiply(3, 7) == 21){
            System.out.println("Method multiply is working good");
        } else System.out.println("Method multiply isn't working");

        //Test of method divide
        if (calculator.divide(20, 10) == 2){
            System.out.println("Method divide is working good");
        } else System.out.println("Method divide isn't working");


        //Test for method isEven
        if (calculator.isEven(5)){
            System.out.println("Method isEven isn't working with odd numbers");
        } else System.out.println("System isEven is working good with odd numbers");

        if (calculator.isEven(80)){
            System.out.println("Method isEven is working good with even numbers");
        } else System.out.println("Method isEven isn't working with even numbers");

        //Test of method maxOfTwoNumbers
        if (calculator.maxOfTwoNumbers(10, 8) == 10){
            System.out.println("Method maxOfTwoNumbers is working good if first number is bigger");
        } else System.out.println("Method maxOfTwoNumbers isn't working if first number is bigger");

        if (calculator.maxOfTwoNumbers(5, 24) == 24)
            System.out.println("Method maxOfTwoNumber is working good if second number is bigger");
        else System.out.println("Method maxOfTwoNumbers isn't working if second number is bigger");

        if (calculator.maxOfTwoNumbers(9, 9) == 0)
            System.out.println("Method maxOfTwoNumbers is working good if numbers are the same");
        else System.out.println("Method maxOfTwoNumbers isn't working good if two numbers are the same");

        //Test of method maxOfThreeNumbers
        if (calculator.maxOfThreeNumbers(1 ,2, 3) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(2 ,1, 3) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(2 ,2, 3) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,2, 1) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,1, 2) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,2, 2) == 3)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(1 ,4, 3) == 4)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,4, 3) == 4)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,4, 2) == 4)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");

        if (calculator.maxOfThreeNumbers(3 ,3, 3) == 0)
            System.out.println("Method maxOfThreeNumbers is working");
        else System.out.println("Method maxOfThreeNumbers isn't working");
    }
}
