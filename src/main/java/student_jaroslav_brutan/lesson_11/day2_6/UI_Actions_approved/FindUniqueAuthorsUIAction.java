package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import java.util.Set;

public class FindUniqueAuthorsUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute(){
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        if (uniqueAuthors.size() == 0){
            System.out.println("No unique authors in library!");
        } else {
            System.out.println("Unique author : ");
            for (String author : uniqueAuthors){
                System.out.println(author);
            }
        }
    }
}
