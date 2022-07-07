package roman.lesson_11.day_3.task_15_16;

public class AuthorSearchCriteria implements SearchCriteria{
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
