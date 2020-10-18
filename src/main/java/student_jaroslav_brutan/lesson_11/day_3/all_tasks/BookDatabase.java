package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookDatabase {

    List<Book> find(SearchCriteria searchCriteria);
}
