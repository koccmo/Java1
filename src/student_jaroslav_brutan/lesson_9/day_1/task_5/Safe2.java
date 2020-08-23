package student_jaroslav_brutan.lesson_9.day_1.task_5;

public class Safe2 {

    private String pinCode;
    private int moneyAmount;


    public Safe2(String pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public int getMoney(String pinCode, int amount){
        if (correctPincode(pinCode)){
            moneyAmount = moneyAmount - amount;
            return amount;
        } else {
            return 0;
        }
    }

    public void putMoney(String pinCode, int amount){
        if (correctPincode(pinCode)){
            moneyAmount = moneyAmount + amount;
        }
    }

    public boolean correctPincode(String pinCode){
        return this.pinCode.equals(pinCode);
    }

    @Override
    public String toString() {
        return "Safe2{" +
                "pinCode='" + pinCode + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
