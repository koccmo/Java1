package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_21;

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