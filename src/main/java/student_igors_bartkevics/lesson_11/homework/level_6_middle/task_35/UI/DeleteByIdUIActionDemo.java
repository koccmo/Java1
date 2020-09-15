package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.BookDatabaseImpl;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_35.UIAction;

class DeleteByIdUIActionDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction deleteByIdUIAction = new DeleteByIdUIAction(bookDatabase);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        deleteByIdUIAction.execute();

    }

}
