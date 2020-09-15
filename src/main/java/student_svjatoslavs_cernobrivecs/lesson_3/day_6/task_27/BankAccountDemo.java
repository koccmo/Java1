package student_svjatoslavs_cernobrivecs.lesson_3.day_6.task_27;

public class BankAccountDemo {

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Viktor",10000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);  //changed owner on ownerFirstName
        System.out.println("Money = " + moneyAmount);     //changed money on moneyAmount
    }
}
