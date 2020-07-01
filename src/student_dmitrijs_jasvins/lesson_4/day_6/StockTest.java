package student_dmitrijs_jasvins.lesson_4.day_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
    }

    public void test1() {
        Stock stock = new Stock("Apple", 10);
        if (stock.printInformation().equals("Company Name : Apple, Current price = 10, " +
                "minPrice = 10, maxPrice = 10")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
        stock.updatePrice(14);
        stock.updatePrice(4);
        stock.updatePrice(15);

        if (stock.printInformation().equals("Company Name : Apple, Current price = 15, " +
                "minPrice = 4, maxPrice = 15")) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }

}

