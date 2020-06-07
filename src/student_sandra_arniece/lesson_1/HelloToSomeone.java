package student_sandra_arniece.lesson_1;
import java.util.Scanner;

public class HelloToSomeone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input your name: ");

        String userName = sc.nextLine();
        System.out.print("Hello \n" +
                "" +userName+ "!");
    }
}
 /* Would add a check for empty input, start with a space, more than 1 space in a row,
  or 3 or more same characters in a row, and limit the input length - so it looks more
  like a name or nickname, if I could :D */

