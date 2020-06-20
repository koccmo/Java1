package student_georgij_galin.lesson3.day_6.task_27;


public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Georgij", 700);
        String ownerName = bankAccount.getOwner();
        int ownerMoney = bankAccount.getMoney();
        System.out.println("Bank information: ");
        System.out.println("Owner name : " + ownerName);
        System.out.println("Owner money amount : " + ownerMoney);
    }
}