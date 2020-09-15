package student_alexey_tretyakov.lesson_3.day_6.Task_27;

// public static class String owner = BancAccount.getOwner();
// public  static class int money = BankAccount.getMoney();

class BankAccount {

        private String ownerName;
        private int moneyAmount;

        public BankAccount( String Name,int Amount) {
            this.ownerName = Name;
            this.moneyAmount = Amount;
        }

        public String getOwner() { return this.ownerName;}

        public String getMoney() { return Integer.toString( this.moneyAmount ); }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        String money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
