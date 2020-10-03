package student_aleksandra_maksimovic.lesson_11.level_2.task_6;

import java.util.List;

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        BookDatabase db = new BookDatabaseImpl();

        Book book1 = new Book("Kuper", "Zveroboj");
        Book book2 = new Book("Kuper", "Moh");
        Book book3 = new Book("Ruper", "Puper");

        db.save(book1);
        db.save(book2);
        db.save(book3);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboj");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        List<Book> result = db.find(searchCriteria);

        for (Book book : result) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }
}
