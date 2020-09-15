package student_igors_bartkevics.lesson_4.homeworks.day_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.max();
        stockTest.min();
        stockTest.currentPrice();
        stockTest.printInfo();
    }

    public void max() {
        Stock stock = new Stock("Apple", 700.00);
        stock.updatePrice(650.5);
        stock.updatePrice(300.20);
        stock.updatePrice(750.0);
        stock.updatePrice(350.7);
        stock.updatePrice(750.0);
        stock.updatePrice(690.99);
        double result = stock.getMaxPrice();
        if (result == 750) {
            System.out.println("Max test = OK");
        }
        else {
            System.out.println("Max test = FAIL");
        }
    }

    public void min() {
        Stock stock = new Stock("Apple", 200.00);
        stock.updatePrice(650.5);
        stock.updatePrice(300.20);
        stock.updatePrice(750.0);
        stock.updatePrice(350.7);
        stock.updatePrice(750.0);
        stock.updatePrice(690.99);
        double result = stock.getMinPrice();
        if (result == 200.00) {
            System.out.println("Min test = OK");
        }
        else {
            System.out.println("Min test = FAIL");
        }
    }

    public void currentPrice() {
        Stock stock = new Stock("Apple", 200.00);
        stock.updatePrice(650.5);
        stock.updatePrice(300.20);
        stock.updatePrice(750.0);
        stock.updatePrice(350.7);
        stock.updatePrice(750.0);
        stock.updatePrice(690.99);
        double result = stock.getPrice();
        if (result == 690.99) {
            System.out.println("Current price test = OK");
        }
        else {
            System.out.println("Current price = FAIL");
        }
    }

    public void printInfo() {
        Stock stock = new Stock("Apple", 200.00);
        stock.updatePrice(650.5);
        stock.updatePrice(300.20);
        stock.updatePrice(750.0);
        stock.updatePrice(350.7);
        stock.updatePrice(750.0);
        stock.updatePrice(690.99);

        String result = stock.printInformation();
        if (result.equals("Company = \"Apple\", Current Price = 690.99, Min Price = 200.0, Max Price = 750.0")) {
            System.out.println("Print information test = OK");
        }
        else {
            System.out.println("Print information = FAIL");
        }
    }

}
