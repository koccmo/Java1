package student_anvars_intezars.home_tasks.lesson_11.level_4_tasks;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void findingAllAuthorsTest() {

        Book firsBook = new Book("Nassim Nicholas Taleb","Antifragile","2003");
        Book secondBook = new Book("Kuper","Zveroboi","1985");
        Book thirdBook = new Book("Anvar Intezar","What happend with world order","2020");
        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        bookDataBase.save(firsBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);

        Set<String> result = bookDataBase.findUniqueAuthors();
        assertTrue(result.contains("Nassim Nicholas Taleb"));

    }

}