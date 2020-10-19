package student_eduards_jasvins.lesson_15.day_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Movie movie1 = new Movie("Movie 43", Movie.REGULAR);
    Movie movie2 = new Movie("Men in Black", Movie.CHILDRENS);
    Movie movie3 = new Movie("Jurassic Park", Movie.NEW_RELEASE);

    @Test
    public void oneRegularMovieOneDay() {
        Customer customerOne = new Customer("Alexander");
        Rental rental = new Rental(movie1, 1);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 2.0"));
        assertTrue(result.contains("You earned 1 frequent renter points"));
    }

    @Test
    public void oneRegularMovieFourDays() {
        Customer customerOne = new Customer("Alexander");
        Rental rental = new Rental(movie1, 4);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 5.0"));
        assertTrue(result.contains("You earned 1 frequent renter points"));

    }

    @Test
    public void oneChildrenMovieOneDay() {
        Customer customerOne = new Customer("Oleg");
        Rental rental = new Rental(movie2, 1);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 1.5"));
        assertTrue(result.contains("You earned 1 frequent renter points"));
    }

    @Test
    public void oneChildrenMovieFiveDays() {
        Customer customerOne = new Customer("Oleg");
        Rental rental = new Rental(movie2, 5);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 4.5"));
        assertTrue(result.contains("You earned 1 frequent renter points"));
    }

    @Test
    public void oneNewReleaseMovieOneDay() {
        Customer customerOne = new Customer("Ivan");
        Rental rental = new Rental(movie3, 1);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 3.0"));
        assertTrue(result.contains("You earned 1 frequent renter points"));
    }

    @Test
    public void oneNewReleaseMovieSixDays() {
        Customer customerOne = new Customer("Ivan");
        Rental rental = new Rental(movie3, 6);
        customerOne.addRental(rental);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 18.0"));
        assertTrue(result.contains("You earned 2 frequent renter points"));
    }

    @Test
    public void oneRegularAndChildrenOneDay() {
        Customer customerOne = new Customer("Ivan");
        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 1);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 3.5"));
        assertTrue(result.contains("You earned 2 frequent renter points"));
    }

    @Test
    public void oneRegularAndNewReleaseOneDay() {
        Customer customerOne = new Customer("Ivan");
        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie3, 1);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 5.0"));
        assertTrue(result.contains("You earned 2 frequent renter points"));
    }

    @Test
    public void oneNewReleaseAndChildrenOneDay() {
        Customer customerOne = new Customer("Ivan");
        Rental rental1 = new Rental(movie2, 1);
        Rental rental2 = new Rental(movie3, 1);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 4.5"));
        assertTrue(result.contains("You earned 2 frequent renter points"));
    }

    @Test
    public void oneRegularAndChildrenThreeDay() {
        Customer customerOne = new Customer("Ivan");
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 3);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 5.0"));
        assertTrue(result.contains("You earned 2 frequent renter points"));
    }

    @Test
    public void oneRegularAndNewReleaseThreeDay() {
        Customer customerOne = new Customer("Oleg");
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie3, 3);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 12.5"));
        assertTrue(result.contains("You earned 3 frequent renter points"));
    }

    @Test
    public void oneNewReleaseAndChildrenThreeDay() {
        Customer customerOne = new Customer("Alexander");
        Rental rental1 = new Rental(movie2, 3);
        Rental rental2 = new Rental(movie3, 3);
        customerOne.addRental(rental1);
        customerOne.addRental(rental2);
        RentalPricePointCalc rentalPricePointCalc = new RentalPricePointCalc();
        String result = rentalPricePointCalc.getPointAndPrice(customerOne);
        assertTrue(result.contains("You owed 10.5"));
        assertTrue(result.contains("You earned 3 frequent renter points"));
    }
}