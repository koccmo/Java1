package student_valerija_ionova.lesson_x.bank_account.part_3_4;

class BankAccountCurrentBalanceCalculator {

    int calculate (BankAccount bankAccount){
        int sum = 0;
        for (Transaction transaction : bankAccount.getTransactions()){
            if (transaction.isDeposit()){
                sum += transaction.getAmount();
            }else{
                sum -= transaction.getAmount();
            }

        }
        return sum;
    }

}
