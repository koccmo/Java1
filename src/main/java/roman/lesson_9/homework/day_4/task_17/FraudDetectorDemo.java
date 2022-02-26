package roman.lesson_9.homework.day_4.task_17;

public class FraudDetectorDemo {
    public static void main(String[] args) {
        FraudDetector fraudDetector = new FraudDetector();

        Trader filip = new Trader("Filip", "Jelgava", "Latvia");
        Transaction overLimit = new Transaction(filip, 1000001);
        System.out.println(fraudDetector.isFraud(overLimit));
        System.out.println("-------");

        Trader ignat = new Trader("Ignat", "Ludza", "Latvia");
        Transaction normal = new Transaction(ignat, 100);
        System.out.println(fraudDetector.isFraud(normal));
    }
}
