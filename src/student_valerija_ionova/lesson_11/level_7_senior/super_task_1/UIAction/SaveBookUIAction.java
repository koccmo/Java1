package student_valerija_ionova.lesson_11.level_7_senior.super_task_1.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.super_task_1.Book;
import student_valerija_ionova.lesson_11.level_7_senior.super_task_1.BookDatabase;

import java.util.Scanner;

//Task 31 Создайте и реализуйте класс SaveBookUIAction:

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Please enter book's author: ");
        Scanner in = new Scanner(System.in);
        String author = in.nextLine();

        System.out.println("Please enter book's title: ");
        String title = in.nextLine();

        System.out.println("Please enter book's year of issue: ");
        String yearOfIssue = in.nextLine();

        Book newBook = new Book(author, title, yearOfIssue);
        bookDatabase.save(newBook);
    }

}