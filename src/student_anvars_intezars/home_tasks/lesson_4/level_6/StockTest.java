package student_anvars_intezars.home_tasks.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.stockTest1();
        stockTest.stockTest2();
        stockTest.stockTest3();
    }

    // Please write separate tests for min/max/current price checks
    public void stockTest1() {
        Stock stock = new Stock("Google", 10);
        if ((stock.getCurrentPrice()) == 10 && (stock.getMaxPrice()) == 10 && (stock.getMinPrice() == 10)) {
            System.out.println("Stock Test1 = OK, All initial price values are correct");
        } else {
            System.out.println("Stock test1 = FAIL, price values are not correct");
        }
        // После того как убделись, что заданые значения каждой категории цен верны, проверим
        // поменяются ли цены после трёх обновлений.
        // Используя метод три раза, должны установиться новые значения трёх категорий.
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);

        if ((stock.getCurrentPrice()) == 14) {
            System.out.println("Stock Test1 = OK, current price is correct");
        }
        else {
            System.out.println("Stock Test1 = FAIL, current price is not correct");
        }
    }

    public void stockTest2() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);

        if ((stock.getMaxPrice()) == 15) {
            System.out.println("Stock Test2 = OK, maximal price is correct");
        } else {
            System.out.println("Stock Test2 = FAIL, maximal price is not correct");
        }
    }

    public void stockTest3() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);

        if ((stock.getMinPrice()) == 7) {
            System.out.println("Stock Test3 = OK, minimal price is correct");
        } else {
            System.out.println("Stock Test3 = FAIL, minimal price is not correct");
        }
    }

}










