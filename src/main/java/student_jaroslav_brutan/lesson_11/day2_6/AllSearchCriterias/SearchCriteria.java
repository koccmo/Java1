package student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);
}
