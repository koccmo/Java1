package student_alexey_tretyakov.lesson_1;


    import java.util.Scanner;

    public class test1 {

        public static void main(String[] args) {
            System.out.println("Enter your number");
            Scanner input = new Scanner(System.in);
            int userNumber = input.nextInt();

            for (int i = 1; i <= 10; i++){

                System.out.print ( userNumber + " x " + i +" = " + (i * userNumber) + "; ");
            }


        }


    }

