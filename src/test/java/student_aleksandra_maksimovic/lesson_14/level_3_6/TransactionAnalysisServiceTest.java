package student_aleksandra_maksimovic.lesson_14.level_3_6;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService analysisService;
    List<Transaction> transactions;

    @Before
    public void init() {
        analysisService = new TransactionAnalysisService();

        TransactionTestData testData = new TransactionTestData();
        transactions = testData.getTransactions();
    }

    @Test
    public void test_FindByYear_1() {
        assertEquals(analysisService.findByYear(transactions, 2011).size(), 2);
    }

    @Test
    public void test_FindByYear_2() {
        assertEquals(analysisService.findByYear(transactions, 2012).size(), 4);
    }

    @Test
    public void test_FindByYear_3() {
        assertEquals(analysisService.findByYear(transactions, 2013).size(), 0);
    }

    @Test
    public void test_sortAsc_1() {
        List<Transaction> result = analysisService.sortAsc(transactions);

        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);
        assertEquals(result.get(2).getValue(), 700);
        assertEquals(result.get(3).getValue(), 710);
        assertEquals(result.get(4).getValue(), 950);
        assertEquals(result.get(5).getValue(), 1000);
    }

    @Test
    public void test_sortDesc_1() {
        List<Transaction> result = analysisService.sortAsc(transactions);

        assertEquals(result.get(5).getValue(), 300);
        assertEquals(result.get(4).getValue(), 400);
        assertEquals(result.get(3).getValue(), 700);
        assertEquals(result.get(2).getValue(), 710);
        assertEquals(result.get(1).getValue(), 950);
        assertEquals(result.get(0).getValue(), 1000);
    }

    @Test
    public void test_findByYearSortAscByValue_1() {
        List<Transaction> result = analysisService.findByYearSortAscByValue(transactions, 2012);

        assertEquals(result.size(), 4);

        assertEquals(result.get(0).getValue(), 700);
        assertEquals(result.get(1).getValue(), 710);
        assertEquals(result.get(2).getValue(), 950);
        assertEquals(result.get(3).getValue(), 1000);
    }

    @Test
    public void test_getAllYears_1() {
        List<Integer> result = analysisService.getAllYears(transactions);

        assertEquals(result.size(), 2);
        assertTrue(result.contains(2011));
        assertTrue(result.contains(2012));
    }

    @Test
    public void test_getAllTraderNames_1() {
        List<String> result = analysisService.getAllTraderNames(transactions);

        assertEquals(result.size(), 4);
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Mario"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));
    }

    @Test
    public void test_getAllTraderCities_1() {
        List<String> result = analysisService.getAllTraderCities(transactions);

        assertEquals(result.size(), 2);
        assertTrue(result.contains("Cambridge"));
        assertTrue(result.contains("Milan"));
    }

    @Test
    public void test_findAllTraderNamesByTraderCity_1() {
        List<String> result = analysisService.findAllTraderNamesByTraderCity(transactions, "Cambridge");

        assertEquals(result.size(), 3);
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));
    }

    @Test
    public void test_containsCity_1() {
        assertTrue(analysisService.containsCity(transactions, "Milan"));
    }

    @Test
    public void test_containsCity_2() {
        assertTrue(analysisService.containsCity(transactions, "Cambridge"));
    }

    @Test
    public void test_containsCity_3() {
        assertFalse(analysisService.containsCity(transactions, "Riga"));
    }

    @Test
    public void test_getMaxValue_1() {
        assertEquals(analysisService.getMaxValue(transactions), Optional.of(1000));
    }

    @Test
    public void test_getMinValue_1() {
        assertEquals(analysisService.getMinValue(transactions), Optional.of(300));
    }

    @Test
    public void test_getAllTraderNamesAsString_1() {
        assertEquals(analysisService.getAllTraderNamesAsString(transactions), "Alan,Brian,Mario,Raoul");
    }

    @Test
    public void test_getAllTraderCitiesAsString_1() {
        assertEquals(analysisService.getAllTraderCitiesAsString(transactions), "Cambridge,Milan");
    }
}