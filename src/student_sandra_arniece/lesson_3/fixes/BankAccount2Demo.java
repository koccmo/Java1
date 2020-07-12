package student_sandra_arniece.lesson_3.fixes;

public class BankAccount2Demo {
    public static void main(String[] args) {
        BankAccount2 bankAccount2 = new BankAccount2("Viktor", 10000);
        String owner = bankAccount2.getOwner();
        int money = bankAccount2.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}
