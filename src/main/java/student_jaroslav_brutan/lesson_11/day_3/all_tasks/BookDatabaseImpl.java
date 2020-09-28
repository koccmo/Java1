package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase{

    @Override
    public List<Book> find(SearchCriteria searchCriteria){
        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0;i < listOfBooks.size();i++){
            if (searchCriteria.match(listOfBooks.get(i))){
                listOfBooks.add(listOfBooks.get(i));
            }
        } return listOfBooks;
    }
}
