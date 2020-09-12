package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_38.BookDatabaseImpl;

class SaveBookUIActionDemo {

    public static void main(String[] args) {
        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SaveBookUIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();

        if (bookDatabase.contains(book1)) {
            System.out.println("OK");
        }
    }


}
