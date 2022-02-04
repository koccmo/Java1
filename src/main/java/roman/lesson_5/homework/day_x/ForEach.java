package roman.lesson_5.homework.day_x;


import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        ForEach test = new ForEach();

        String[] doName = test.names(3);
        test.fillUpNames(doName);
        test.printAllNames(doName);
        test.checkForEach(doName);


    }

    public String[] names(int lengthArray) {return new String[lengthArray];}

    public void fillUpNames (String[] names) {
        for(int i = 0; i < names.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name Nr. " + (i + 1) + " - ");
            names[i] = scanner.nextLine();
        }
    }

    public void printAllNames (String[] names) {
        for(int i = 0; i < names.length; i++) {
            if (i == 0) {
                System.out.print("List of Name - " + names[i]);
            } else {
                System.out.print("," + names[i]);
            }
        }
    }

    public void checkForEach (String[] array) {
        for (String u : array) {
            System.out.println();
            System.out.print(u);
        }
    }
}
