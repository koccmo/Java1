package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute(){
        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        if (uniqueTitles.size()==0){
            System.out.println("No books with unique titles");
        } else {
            System.out.println("Unique titles : ");
            for (String title : uniqueTitles){
                System.out.println(title);
            }
        }
    }
}
