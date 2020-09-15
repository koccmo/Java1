package student_sandra_arniece.lesson_4.level_6; //Task 17

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.printInformationTest();
        stockTest.priceUpdateTest();
    }

    public void printInformationTest() {
        Stock stockNew = new Stock("GOOG", 10);
        if (stockNew.getCurrentPrice() == 10.0 && stockNew.getMinPrice() == 10.0 && stockNew.getMaxPrice() == 10.0) {
            System.out.println("printInformationTest = OK");
        } else {
            System.out.println("printInformationTest = FAIL");
        }
    }

    public void priceUpdateTest() {
        Stock stockUpdated = new Stock("GOOG", 10);
        stockUpdated.updatePrice(12);
        stockUpdated.updatePrice(25);
        stockUpdated.updatePrice(67);
        stockUpdated.updatePrice(55);
        stockUpdated.updatePrice(3);
        stockUpdated.updatePrice(15);
        if (stockUpdated.getCurrentPrice() == 15.0 && stockUpdated.getMinPrice() == 3.0 && stockUpdated.getMaxPrice() == 67.0) {
            System.out.println("priceUpdateTest = OK");
        } else {
            System.out.println("priceUpdateTest = FAIL");
        }
    }

}
