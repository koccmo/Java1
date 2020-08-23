package student_valerija_ionova.lesson_x.bank_account.part_3_4;

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        int min = bankAccount.getTransactions().get(0).getAmount();
        int sum =0;
        for (Transaction transaction : bankAccount.getTransactions()){
            if (transaction.isDeposit()){
                sum += transaction.getAmount();
            }else{
                if (transaction.isWithdrawal()){
                    sum -= transaction.getAmount();
                    if (min < sum){
                        min = sum;
                    }
                }
            }

        }

        return min;
    }
}
