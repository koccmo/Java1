package student_anvars_intezars.home_tasks.lesson_4.level_6;

public class StockDemo {

    public static void main(String[] args) {

        StockDemo googleTest = new StockDemo();

        Stock google = new Stock();
        google.setName("GOOG");
        google.setCurrentPrice(10);
        google.setMinPrice(10);
        google.setMaxPrice(10);
        google.updatePrice(11,10,20);
        google.printInformation();

    }
}
