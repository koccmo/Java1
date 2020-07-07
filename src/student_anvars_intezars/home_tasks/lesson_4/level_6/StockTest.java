package student_anvars_intezars.home_tasks.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.StockTest1();
    }

    public void StockTest1() {
        Stock stock = new Stock("Google", 10);
        if ((stock.getCurrentPrice()) == 10 && (stock.getMaxPrice()) == 10 && (stock.getMinPrice() == 10)) {
            System.out.println("Stock Test 1 = OK, All price values are correct");
        } else {
            System.out.println("Stock test 1 = FAIL, price values are not correct");
        }
        // После того как убделись, что заданые значения каждой категории цен верны, проверим
        // поменяются ли цены после трёх обновлений.
        // Используя метод три раза, должны установиться новые значения трёх категорий.
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        if ((stock.getCurrentPrice()) == 14 && (stock.getMaxPrice()) == 15 && (stock.getMinPrice() == 7)) {
            System.out.println("Stock test1 = OK, all price values were changed after the update correctly");
        }
        else {
            System.out.println("Stock test1 = FAIL, all price values were not updated correctly");
        }

    }
}










