package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction  {

    private BookDataBase bookDataBase;

    public FindUniqueTitlesUIAction (BookDataBase bookDataBase) {
        this. bookDataBase = bookDataBase;
    }
    @Override
    public void execute() {
        Set<String> uniqueAuthors = bookDataBase.findUniqueTitles();
        System.out.println("These are unique titles from the library: ");
        System.out.println(uniqueAuthors.toString());
    }
}
