package student_alexey_tretyakov.lesson_3.day_3;
 /* Task_3
 Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.
  */

public class RobotDemo {

     public static void main(String[] args) {

         // Task_12 +

         Robot robot1 = new Robot("Rider");
         robot1.sayHello();
         robot1.sayYourName();
         Robot robot2 = new Robot("John");
         robot2.sayHello();
         robot2.sayYourName();


         /*
         Scanner scanner = new Scanner(System.in);
         System.out.println("\n \n We make a whole army of robots!!!");
         System.out.print(" How many robots you want? Please, input number = ");
         int scanNumber = scanner.nextInt();

         Robot[] robotArmy = new Robot[scanNumber+1];

         for (int i=1; i<=scanNumber; i++) {
            robotArmy[i] = new Robot();
            System.out.print("Robot number " + i + " say hello!  -  ");
            robotArmy[i].sayHello();
            robotArmy[i].sayYourName();
            System.out.println( " " + i );

        }

          */


     }

}
