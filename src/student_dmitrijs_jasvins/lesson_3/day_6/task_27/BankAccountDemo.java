package student_dmitrijs_jasvins.lesson_3.day_6.task_27;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Dmitry", 150);
        String ownerName = bankAccount.getOwner();
        int ownerMoney = bankAccount.getMoney();
        System.out.println("Bank information: ");
        System.out.println("Owner name : " + ownerName);
        System.out.println("Owner money amount : " + ownerMoney);
    }
}
