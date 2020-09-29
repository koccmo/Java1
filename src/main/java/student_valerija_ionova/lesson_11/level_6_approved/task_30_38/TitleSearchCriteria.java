package student_valerija_ionova.lesson_11.level_6_approved.task_30_38;

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
