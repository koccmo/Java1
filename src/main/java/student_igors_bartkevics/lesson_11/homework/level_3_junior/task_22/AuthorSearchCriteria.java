package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
