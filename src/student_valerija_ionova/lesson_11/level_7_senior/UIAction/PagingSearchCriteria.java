package student_valerija_ionova.lesson_11.level_7_senior.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.Book;
import student_valerija_ionova.lesson_11.level_7_senior.SearchCriteria;

public class PagingSearchCriteria implements SearchCriteria {

    @Override
    public boolean match(Book book) {
        return true;
    }
}

