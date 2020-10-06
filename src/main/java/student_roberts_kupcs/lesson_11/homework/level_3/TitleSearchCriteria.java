package student_roberts_kupcs.lesson_11.homework.level_3;

class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если название книги совпадает с this.titleToSearch
        // иначе return false
        return book.getTitle().equals(this.titleToSearch);
    }
}
