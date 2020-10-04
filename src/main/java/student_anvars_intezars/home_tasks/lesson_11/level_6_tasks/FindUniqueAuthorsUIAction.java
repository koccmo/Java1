package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.Scanner;
import java.util.Set;

class FindUniqueAuthorsUIAction implements UIAction{

    private BookDataBase bookDataBase;

    public FindUniqueAuthorsUIAction (BookDataBase bookDataBase) {
        this. bookDataBase = bookDataBase;
    }
    @Override
    public void execute() {
        Set<String> uniqueAuthors = bookDataBase.findUniqueAuthors();
        System.out.println("These are unique authors from the library: ");
        System.out.println(uniqueAuthors.toString());
    }
}
