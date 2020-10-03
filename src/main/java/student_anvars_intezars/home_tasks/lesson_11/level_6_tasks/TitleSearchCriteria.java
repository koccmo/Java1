package student_anvars_intezars.home_tasks.lesson_11.level_6_tasks;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (titleToSearch.equals(book.getTitle())) {
            return true;
        }

        return false;
    }
}
