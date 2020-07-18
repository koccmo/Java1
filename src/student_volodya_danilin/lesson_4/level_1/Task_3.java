package student_volodya_danilin.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] Args){

        int readNumber;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter number from 1 to 7: ");
        readNumber = sc1.nextInt();

        switch(readNumber){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
        }
    }

}
