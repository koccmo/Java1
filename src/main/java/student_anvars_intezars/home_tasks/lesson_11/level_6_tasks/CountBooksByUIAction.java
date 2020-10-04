package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.List;
import java.util.Scanner;

class CountBooksByUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public CountBooksByUIAction(BookDataBase bookDataBase) {
        this. bookDataBase = bookDataBase;
    }
    @Override
    public void execute() {

        int numberOfAllBooks = bookDataBase.countAllBooks();
            System.out.println("In the library there are " + numberOfAllBooks + " books");
        }
    }
