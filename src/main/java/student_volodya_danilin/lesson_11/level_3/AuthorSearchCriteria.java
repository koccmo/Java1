package student_volodya_danilin.lesson_11.level_3;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

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
