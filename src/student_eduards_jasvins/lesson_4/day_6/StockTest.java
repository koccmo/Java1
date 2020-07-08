package student_eduards_jasvins.lesson_4.day_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test();
    }
    
    public void test() {
        Stock stock = new Stock("Tello", 10);
        if (stock.getCurrentPrice() == 10 && stock.getMinPrice() == 10 && stock.getMaxPrice() == 10) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL"); }

        stock.updatePrice(14);
        stock.updatePrice(7);
        stock.updatePrice(15);

        if (stock.getCurrentPrice() == 15 && stock.getMinPrice() == 7 && stock.getMaxPrice() == 15) {
            System.out.println("Stock test1 = OK");
        } else {
            System.out.println("Stock test1 = FAIL");
        }

    }
}
