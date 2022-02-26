package roman.lesson_9.homework.day_1.task_5;

import java.math.BigDecimal;
import java.util.Objects;

public class DepositTwo {

    private String pinCode;
    private BigDecimal amount;

    DepositTwo(String pinCode, BigDecimal amount) {
        this.pinCode = pinCode;
        this.amount = amount;
    }

    public void putMoney(String pinCode, BigDecimal amount) {
        if(isPinCodeCorrect(pinCode)) {
            this.amount = this.amount.add(amount);
        } else System.out.println("PinCode not correct!");
    }

    public BigDecimal getMoney(String pinCode, BigDecimal amount) {
        if(isPinCodeCorrect(pinCode) && isAmountEnough(amount)) {
            this.amount = this.amount.subtract(amount);
            return amount;
        } else return null;
    }

    private boolean isAmountEnough(BigDecimal amount) {
        return this.amount.compareTo(amount) >= 0;
    }
    private boolean isPinCodeCorrect(String pinCode) {
        return this.pinCode.equals(pinCode);
    }

    @Override
    public String toString() {
        return "DepositTwo{" +
                "pinCode='" + pinCode + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositTwo that = (DepositTwo) o;
        return Objects.equals(pinCode, that.pinCode) && Objects.equals(amount, that.amount);
    }


}
