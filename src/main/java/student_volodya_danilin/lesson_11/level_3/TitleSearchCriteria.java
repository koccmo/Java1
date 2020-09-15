package student_volodya_danilin.lesson_11.level_3;

class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        boolean result = false;
        if (book.getTitle().contains(this.titleToSearch)) {
            result = true;
        }
        return result;
    }

}
