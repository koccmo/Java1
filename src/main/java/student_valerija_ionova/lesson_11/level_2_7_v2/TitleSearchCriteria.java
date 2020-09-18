package student_valerija_ionova.lesson_11.level_2_7_v2;


class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)){
            return true;
        }else{
            return false;
        }
    }

}
