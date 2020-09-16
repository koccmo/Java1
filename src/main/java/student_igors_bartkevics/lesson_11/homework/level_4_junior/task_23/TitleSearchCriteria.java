package student_igors_bartkevics.lesson_11.homework.level_4_junior.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }

}