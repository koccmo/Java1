package student_jaroslav_brutan.lesson_11.day_3.all_tasks;

public class AuthorSearchCriteria implements SearchCriteria{

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book){
        if (book.getAuthor().equals(authorToSearch)){
            return true;
        } return false;
    }
}
