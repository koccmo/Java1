package student_valerija_ionova.lesson_15.level_6_middle.task_17.videostore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Movie movie1 = new Movie ("Movie1", Movie.REGULAR);
    Movie movie2 = new Movie ("Movie2", Movie.NEW_RELEASE);
    Movie movie3 = new Movie ("Movie3", Movie.CHILDREN);

    @Test
    public void testOneRegularMovieOneDay(){
        Rental rental = new Rental(movie1, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        assertTrue(customer1.statement().contains("You owed 2.0"));
        assertTrue(customer1.statement().contains("You earned 1 frequent renter points"));
    }

    @Test
    public void testOneRegularMovieFiveDays(){
        Rental rental = new Rental(movie1, 5);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        assertTrue(customer1.statement().contains("You owed 6.5"));
        assertTrue(customer1.statement().contains("You earned 1 frequent renter points"));
    }

    @Test
    public void testOneNewReleaseMovieOneDay(){
        Rental rental = new Rental(movie2, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        System.out.println(customer1.statement());
        assertTrue(customer1.statement().contains("You owed 3.0"));
        assertTrue(customer1.statement().contains("You earned 1 frequent renter points"));
    }

    @Test
    public void testOneNewReleaseMovieTwoDays(){
        Rental rental = new Rental(movie2, 2);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        assertTrue(customer1.statement().contains("You owed 6.0"));
        assertTrue(customer1.statement().contains("You earned 2 frequent renter points"));
    }

    @Test
    public void testOneChildrenMovieOneDay(){
        Rental rental = new Rental(movie3, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        assertTrue(customer1.statement().contains("You owed 1.5"));
        assertTrue(customer1.statement().contains("You earned 1 frequent renter points"));
    }

    @Test
    public void testOneChildrenMovieFourDays(){
        Rental rental = new Rental(movie3, 4);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        assertTrue(customer1.statement().contains("You owed 3.0"));
        assertTrue(customer1.statement().contains("You earned 1 frequent renter points"));
    }

    @Test
    public void testOneChildrenOneRegularMovieOneDay(){
        Rental rental = new Rental(movie3, 1);
        Rental rental1 = new Rental(movie1, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        assertTrue(customer1.statement().contains("You owed 3.5"));
        assertTrue(customer1.statement().contains("You earned 2 frequent renter points"));
    }

    @Test
    public void testOneNewOneRegularMovieOneDay(){
        Rental rental = new Rental(movie2, 1);
        Rental rental1 = new Rental(movie1, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        assertTrue(customer1.statement().contains("Movie2\t3.0"));
        assertTrue(customer1.statement().contains("Movie1\t2.0"));
        assertTrue(customer1.statement().contains("You earned 2 frequent renter points"));
    }

    @Test
    public void testOneNewOneChildrenMovieOneDay(){
        Rental rental = new Rental(movie2, 1);
        Rental rental1 = new Rental(movie3, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        System.out.println(customer1.statement());
        assertTrue(customer1.statement().contains("Movie2\t3.0"));
        assertTrue(customer1.statement().contains("Movie3\t1.5"));
        assertTrue(customer1.statement().contains("You earned 2 frequent renter points"));
    }

    @Test
    public void testOneChildrenOneRegularMovieFourDay(){
        Rental rental = new Rental(movie3, 4);
        Rental rental1 = new Rental(movie1, 4);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        assertTrue(customer1.statement().contains("You owed 8.0"));
        assertTrue(customer1.statement().contains("You earned 2 frequent renter points"));
    }

    @Test
    public void testOneNewOneRegularMovieFiveDays(){
        Rental rental = new Rental(movie2, 5);
        Rental rental1 = new Rental(movie1, 5);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        assertTrue(customer1.statement().contains("Movie2\t15.0"));
        assertTrue(customer1.statement().contains("Movie1\t6.5"));
        assertTrue(customer1.statement().contains("You earned 3 frequent renter points"));
    }

    @Test
    public void testOneNewOneChildrenMovieSixDays(){
        Rental rental = new Rental(movie2, 6);
        Rental rental1 = new Rental(movie3, 6);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        assertTrue(customer1.statement().contains("Movie2\t18.0"));
        assertTrue(customer1.statement().contains("Movie3\t6.0"));
        assertTrue(customer1.statement().contains("You earned 3 frequent renter points"));
    }

    @Test
    public void testAllMoviesOneDay(){
        Rental rental = new Rental(movie2, 1);
        Rental rental1 = new Rental(movie3, 1);
        Rental rental2 = new Rental(movie1, 1);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        System.out.println(customer1.statement());
        assertTrue(customer1.statement().contains("Movie2\t3.0"));
        assertTrue(customer1.statement().contains("Movie3\t1.5"));
        assertTrue(customer1.statement().contains("Movie1\t2.0"));
        assertTrue(customer1.statement().contains("You earned 3 frequent renter points"));
    }

    @Test
    public void testAllMoviesTenDaysDays(){
        Rental rental = new Rental(movie2, 10);
        Rental rental1 = new Rental(movie3, 10);
        Rental rental2 = new Rental(movie1, 10);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        System.out.println(customer1.statement());
        assertTrue(customer1.statement().contains("Movie2\t30.0"));
        assertTrue(customer1.statement().contains("Movie3\t12.0"));
        assertTrue(customer1.statement().contains("Movie1\t14.0"));
        assertTrue(customer1.statement().contains("You earned 4 frequent renter points"));
    }

    @Test
    public void testAllMoviesTenDifferentDays(){
        Rental rental = new Rental(movie2, 1);
        Rental rental1 = new Rental(movie3, 3);
        Rental rental2 = new Rental(movie1, 6);
        Customer customer1 = new Customer("Bob");
        customer1.addRental(rental);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        System.out.println(customer1.statement());
        assertTrue(customer1.statement().contains("Movie2\t3.0"));
        assertTrue(customer1.statement().contains("Movie3\t1.5"));
        assertTrue(customer1.statement().contains("Movie1\t8.0"));
        assertTrue(customer1.statement().contains("You earned 3 frequent renter points"));
    }

}