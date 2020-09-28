package student_valerija_ionova.lesson_11.level_3_approved.task_15_22_not_approve;

//Task16 Создайте класс AuthorSearchCriteria:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria{

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equals(authorToSearch)){
            return true;
        }else{
            return false;
        }
    }

}
