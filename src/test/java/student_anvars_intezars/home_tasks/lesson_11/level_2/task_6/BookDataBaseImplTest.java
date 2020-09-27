package student_anvars_intezars.home_tasks.lesson_11.level_2.task_6;

import org.junit.Test;


import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void generateID() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb", "Antifragile");
        Book secondBook = new Book("Juval Noah Harari", "Homo Deus");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        Long firstID = firstBook.getId();
        Long secondID = secondBook.getId();
        //assertEquals(firstID,1L);
        //assertEquals(secondID,2l);

    }

    @Test
    public void deleteBookByID() {

        BookDataBaseImpl bookDataBase = new BookDataBaseImpl();

        Book firstBook = new Book("Nassim Taleb","Antifragile");
        Book secondBook = new Book("Juval Noah Harari","Homo Deus");
        bookDataBase.save(firstBook);
        bookDataBase.save(secondBook);
        Long bookID = secondBook.getId();
        Boolean result = bookDataBase.delete(bookID);
        assertEquals(result,true);


    }

}