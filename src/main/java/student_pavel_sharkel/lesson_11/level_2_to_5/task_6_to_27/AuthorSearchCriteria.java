package student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если автор книги совпадает с this.authorToSearch
        // иначе return false
        if (authorToSearch.equals(book.getAuthor())) {
            return true;
        } else {return false;}
    }

}
