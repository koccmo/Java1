package student_volodya_danilin.lesson_11.level_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    @CodeReviewComment(teacher = "Remove this unused field!")
    BookDatabaseImpl database;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        boolean result = false;
        if (book.getAuthor().contains(this.authorToSearch)) {
            result = true;
        }
        return result;
    }
}
