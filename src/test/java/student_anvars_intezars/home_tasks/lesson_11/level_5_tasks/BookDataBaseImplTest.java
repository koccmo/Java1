package student_anvars_intezars.home_tasks.lesson_11.level_5_tasks;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void getAuthorToBooksMapTest() {

        Book firsBook = new Book("Nassim Nicholas Taleb", "Antifragile", "2003");
        Book secondBook = new Book("Kuper", "Zveroboi", "1985");
        Book thirdBook = new Book("Anvar Intezar", "What happened with world order", "2020");
        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        bookDataBase.save(firsBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);

        Map<String, List<Book>> result = bookDataBase.getAuthorToBooksMap();
        assertTrue(result.containsKey("Nassim Nicholas Taleb"));
        assertTrue(result.containsKey("Kuper"));
        assertTrue(result.containsKey("Anvar Intezar"));
        assertEquals(result.size(), 3);
    }

    @Test
    public void findUniqueAuthors() {
        Book firsBook = new Book("Nassim Nicholas Taleb", "Antifragile", "2003");
        Book secondBook = new Book("Kuper", "Zveroboi", "1985");
        Book thirdBook = new Book("Anvar Intezar", "What happened with world order", "2020");
        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        bookDataBase.save(firsBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);

        Set<String> result = bookDataBase.findUniqueAuthors();
        assertEquals(result.size(), 3);

    }

    @Test
    public void findUniqueTitles() {
        Book firsBook = new Book("Nassim Nicholas Taleb", "Antifragile", "2003");
        Book secondBook = new Book("Kuper", "Zveroboi", "1985");
        Book thirdBook = new Book("Anvar Intezar", "What happened with world order", "2020");
        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();
        bookDataBase.save(firsBook);
        bookDataBase.save(secondBook);
        bookDataBase.save(thirdBook);

        Set<String> result = bookDataBase.findUniqueTitles();
        assertEquals(result.size(), 3);
    }
}