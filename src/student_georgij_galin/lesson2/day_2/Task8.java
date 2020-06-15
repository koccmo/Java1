package student_georgij_galin.lesson2.day_2;

import java.util.Scanner;

class Username {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}