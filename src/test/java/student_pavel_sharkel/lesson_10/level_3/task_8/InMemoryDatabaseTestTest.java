package student_pavel_sharkel.lesson_10.level_3.task_8;

//import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InMemoryDatabaseTestTest{

    private InMemoryDatabase inMemoryDatabase;
    private Product product;

    @Test
    public void inDatabaseTrue() {
        inMemoryDatabase = new InMemoryDatabase();

        inMemoryDatabase.save(product = new Product( "apple"));

        Product result = inMemoryDatabase.findByTitle("apple");
        assertEquals(product, result);
    }

    @Test
    public void inDatabaseNull() {
        inMemoryDatabase = new InMemoryDatabase();

        inMemoryDatabase.save(product = new Product( "apple"));

        Product result = inMemoryDatabase.findByTitle("orange");
        assertEquals(null, result);
    }

}