package roman.lesson_4.homework.day_6.task_17;

public class StockTest {
    Stock htc = new Stock("HTC",5);
    public static void main(String[] args) {
        StockTest stockInfo = new StockTest();
        stockInfo.maxStockPriceTest();
        stockInfo.minStockPriceTest();
        stockInfo.currentStockPrice();
        stockInfo.infoCheck();



    }
    public void maxStockPriceTest(){
        htc.updatePrice(15);
        htc.updatePrice(5);
        htc.updatePrice(133);
        htc.updatePrice(24);
        htc.updatePrice(13);
        int result = htc.seeMaxPrice();
        if (result == 133) {
            System.out.println("Max Price Test OK!!!");
        } else System.out.println("Max Price Test Fail!!!");
    }
    public void minStockPriceTest() {
        htc.updatePrice(35);
        htc.updatePrice(15);
        htc.updatePrice(1);
        htc.updatePrice(1335);
        htc.updatePrice(2);
        int result = htc.seeMinPrice();
        if (result == 1) {
            System.out.println("Min Price Test OK!!!!");
        } else System.out.println("Min Price Test Fail!!!!");
    }

    public void currentStockPrice() {
        htc.updatePrice(2);
        htc.updatePrice(1);
        htc.updatePrice(3);
        htc.updatePrice(5);
        htc.updatePrice(11);
        int result = htc.seeCurrentPrice();
        if (result == 11) {
            System.out.println("Curent Price Test OK!!!!");
        } else System.out.println("Current Price Test Fail!!!");
    }
    public void infoCheck() {
        String result = htc.getPriceInformation();
        if (result.equals("Company name : HTC Current Price = 11 Min Price = 1 Max Price = 1335")) {
            System.out.println("Info Test OK!!");
        } else System.out.println("Info Test Fail!!!");
    }
}
