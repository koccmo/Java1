package student_eduards_jasvins.lesson_11.day_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
