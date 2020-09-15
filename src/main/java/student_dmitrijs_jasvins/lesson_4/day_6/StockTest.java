package student_dmitrijs_jasvins.lesson_4.day_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
    }

	// Please write separate tests for min/max/current price checks
	// Good practice to check one thing in one test!!!
    public void test1() {
        Stock stock = new Stock("Apple", 10);
        if (stock.getCurrentPrice() == 10 && stock.getMaxPrice() == 10 && stock.getMinPrice() == 10) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
        stock.updatePrice(14);
        stock.updatePrice(4);
        stock.updatePrice(15);

        if (stock.getCurrentPrice() == 15 && stock.getMaxPrice() == 15 && stock.getMinPrice() == 4) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }

}

