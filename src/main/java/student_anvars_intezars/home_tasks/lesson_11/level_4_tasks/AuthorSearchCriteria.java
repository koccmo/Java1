package student_anvars_intezars.home_tasks.lesson_11.level_4_tasks;

class AuthorSearchCriteria  implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (authorToSearch.equals(book.getAuthor())) {
            return true;
        }

        return false;
    }
}
