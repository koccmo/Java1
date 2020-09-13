package student_valerija_ionova.lesson_11.level_7_senior;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria (String titleToSearch){
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)){
            return true;
        }else {
            return false;
        }
    }
}
