package student_pavel_sharkel.lesson_11.level_2.task_6_to_14;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если название книги совпадает с this.titleToSearch
        // иначе return false
        if (book.getTitle().equals(titleToSearch)) {
            return true;
        } else {return false;}
    }

}
