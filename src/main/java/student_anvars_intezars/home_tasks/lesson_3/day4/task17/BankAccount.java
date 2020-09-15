package student_anvars_intezars.home_tasks.lesson_3.day4.task17;

public class BankAccount {

        private String ownerFirstName;
        private String ownerLastName;
        private int moneyAmount;

    public BankAccount(String ownerFirstName,
                String ownerLastName,
        int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

        public String getOwnerLastName() {
            return this.ownerLastName;
        }

        public int getMoneyAmount() {
            return this.moneyAmount;
        }

}
