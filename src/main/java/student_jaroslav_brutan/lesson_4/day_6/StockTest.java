package student_jaroslav_brutan.lesson_4.day_6;

public class StockTest {

    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.maxTest();
        test.minTest();
        test.currentTest();
    }

    public void maxTest(){
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        double result = stock.getMaxPrice();
        if (result == 99){
            System.out.println("Max Test = OK!");
        } else {
            System.out.println("Max Test - FAIL!");
        }
    }

    public void minTest(){
        Stock stock = new Stock("Google", 11);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        double result = stock.getMinPrice();
        if (result == 5){
            System.out.println("Min Test = OK!");
        } else {
            System.out.println("Min Test - FAIL!");
        }
    }

    public void currentTest(){
        Stock stock = new Stock("Google", 11);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        double result = stock.getCurrentPrice();
        if (result == 77){
            System.out.println("Current Test = OK!");
        } else {
            System.out.println("Current Test - FAIL!");
        }
    }


}
