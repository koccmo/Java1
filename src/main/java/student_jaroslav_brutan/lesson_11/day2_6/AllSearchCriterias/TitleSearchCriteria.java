package student_jaroslav_brutan.lesson_11.day2_6.AllSearchCriterias;

import student_jaroslav_brutan.lesson_11.day2_6.Book;

public class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book){
        return book.getTitle().equals(titleToSearch);
    }
}
