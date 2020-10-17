package student_eduards_jasvins.lesson_14.day_3;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionTestData data = new TransactionTestData();
    List <Transaction> transactions = data.getTransactions();
    TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    public void findAllTransFor2011() {
        List <Transaction> findAllTransFor2011 =
                service.findAllTransFor2011(transactions);
        assertEquals(2, findAllTransFor2011.size());

    }

    @Test
    public void findAllTransForYear() {
        List <Transaction> findAllTransForYear2011 =
                service.findAllTransForYear(transactions, 2011);
        List <Transaction> findAllTransForYear2012 =
                service.findAllTransForYear(transactions, 2012);
        assertEquals(2, findAllTransForYear2011.size());
        assertEquals(4, findAllTransForYear2012.size());


    }

    @Test
    public void sortTransactionByValue() {
        List <Transaction> sortTransByValue =
                service.sortTransactionByValue(transactions);
        assertEquals(300, sortTransByValue.get(0).getValue());
        assertEquals(400, sortTransByValue.get(1).getValue());
        assertEquals(700, sortTransByValue.get(2).getValue());
        assertEquals(710, sortTransByValue.get(3).getValue());
        assertEquals(950, sortTransByValue.get(4).getValue());
        assertEquals(1000, sortTransByValue.get(5).getValue());

    }

    @Test
    public void sortTransactionByValueInReverse() {
        List <Transaction> sortTransactionByValueInRev =
                service.sortTransactionByValueInReverse(transactions);
        assertEquals(1000, sortTransactionByValueInRev.get(0).getValue());
        assertEquals(950, sortTransactionByValueInRev.get(1).getValue());
        assertEquals(710, sortTransactionByValueInRev.get(2).getValue());
        assertEquals(700, sortTransactionByValueInRev.get(3).getValue());
        assertEquals(400, sortTransactionByValueInRev.get(4).getValue());
        assertEquals(300, sortTransactionByValueInRev.get(5).getValue());

    }

    @Test
    public void findAllTransFor2011YearAndSortThemByValue() {
        List <Transaction> sortTransactionFor2011SortThemByValue =
                service.findAllTransFor2011YearAndSortThemByValue(transactions);
        assertEquals(300, sortTransactionFor2011SortThemByValue.get(0).getValue());
        assertEquals(400, sortTransactionFor2011SortThemByValue.get(1).getValue());
        assertEquals(2, sortTransactionFor2011SortThemByValue.size());
    }

    @Test
    public void findYearsOfTransaction() {
        List <Integer> findYearsOfTransactions =
                service.findYearsOfTransaction(transactions);
        assertEquals(6, findYearsOfTransactions.size());
        assertTrue(findYearsOfTransactions.contains(2011));
        assertTrue(findYearsOfTransactions.contains(2012));

    }

    @Test
    public void findUniqueNamesOfTraders() {
        List <String> uniqueNamesOfTraders =
                service.findUniqueNamesOfTraders(transactions);
        assertEquals(4, uniqueNamesOfTraders.size());
        assertTrue(uniqueNamesOfTraders.contains("Raoul"));
        assertTrue(uniqueNamesOfTraders.contains("Mario"));
        assertTrue(uniqueNamesOfTraders.contains("Alan"));
        assertTrue(uniqueNamesOfTraders.contains("Brian"));
    }

    @Test
    public void findUniqueCitiesOfTraders() {
        List <String> uniqueCitiesOfTraders =
                service.findUniqueCitiesOfTraders(transactions);
        assertEquals(6, uniqueCitiesOfTraders.size());
        assertTrue(uniqueCitiesOfTraders.contains("Cambridge"));
        assertTrue(uniqueCitiesOfTraders.contains("Milan"));

    }

    @Test
    public void findUniqueNamesFromCambridge() {
        Set <String> uniqueNamesFromCambridge =
                service.findUniqueNamesFromCambridge(transactions);
        assertEquals(3, uniqueNamesFromCambridge.size());
        assertTrue(uniqueNamesFromCambridge.contains("Raoul"));
        assertTrue(uniqueNamesFromCambridge.contains("Brian"));
        assertTrue(uniqueNamesFromCambridge.contains("Alan"));

    }

    @Test
    public void findUniqueNamesOfTradersByCity() {
        List <String> uniqueNamesOfTradersByCity =
                service.findUniqueNamesOfTradersByCity(transactions, "Cambridge");
        assertEquals(3, uniqueNamesOfTradersByCity.size());
        assertTrue(uniqueNamesOfTradersByCity.contains("Raoul"));

    }

    @Test
    public void inMilanWorksAnyTrader() {
        boolean result =
                service.inMilanWorksAnyTrader(transactions);
        assertTrue(result);
    }

    @Test
    public void inAnyTraderInTransactionsBasedInCity() {
        assertTrue(service.inAnyTraderInTransactionsBasedInCity(transactions, "Cambridge"));
        assertTrue(service.inAnyTraderInTransactionsBasedInCity(transactions, "Milan"));
    }

    @Test
    public void maxValueOfTransactions() {

        assertEquals(Optional.of(1000), service.maxValueOfTransactions(transactions));
    }

    @Test
    public void minValueOfTransactions() {
        assertEquals(Optional.of(300), service.minValueOfTransactions(transactions));
    }

    @Test
    public void getStringOfAllTradersSortedAndSplitByComa() {
        String result = service.getStringOfAllTradersSortedAndSplitByComa(transactions);
        String expectedResult = "Alan,Brian,Mario,Raoul";
        assertEquals(expectedResult, result);
    }
}