package student_valerija_ionova.lesson_11.level_6_approved.task_30_38;

//Task16 Создайте класс AuthorSearchCriteria:

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equals(authorToSearch)){
            return true;
        }else{
            return false;
        }
    }

}
