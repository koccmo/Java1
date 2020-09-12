package student_valerija_ionova.lesson_11.level_6.task_30_38.UIAction;

import student_valerija_ionova.lesson_11.level_6.task_30_38.Book;
import student_valerija_ionova.lesson_11.level_6.task_30_38.SearchCriteria;

public class PagingSearchCriteria implements SearchCriteria {

    @Override
    public boolean match(Book book) {
        return true;
    }
}

