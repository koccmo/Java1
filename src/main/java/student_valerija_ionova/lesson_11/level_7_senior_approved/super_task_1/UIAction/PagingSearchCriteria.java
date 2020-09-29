package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_1.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_1.Book;
import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_1.SearchCriteria;

public class PagingSearchCriteria implements SearchCriteria {

    @Override
    public boolean match(Book book) {
        return true;
    }
}

