package student_volodya_danilin.lesson_9.level_4_5;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult() {
        this.fraud = false;
        this.ruleName = "";
    }

    void setFraud(boolean setStatus) {
        this.fraud = setStatus;
    }

    void addBrokenRules(String ruleName) {
        this.ruleName += "\n   ---" + ruleName;
    }

    void printResultFDR(Transaction t) {
        System.out.println("============ Transaction Stats ============");
        System.out.println("Trader's name : " + t.getTrader().getFullName());
        System.out.println("Trader's city : " + t.getCity(t));
        System.out.println("Trader's country : " + t.getCountry(t));
        System.out.println("Transaction amount : " + t.getAmount());
        System.out.println("Fraud found? : " + this.fraud);
        if (this.fraud) {
            System.out.println("Broken rules : " + this.ruleName);
        }
        System.out.println("===========================================\n");
    }
}
