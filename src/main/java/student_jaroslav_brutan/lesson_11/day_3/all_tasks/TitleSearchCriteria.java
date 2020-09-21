package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

public class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book){
        if (book.getTitle().equals(titleToSearch)){
            return true;
        } return false;
    }
}
