package student_valerija_ionova.lesson_x.part_3;

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        int sum = 0;
        int max = bankAccount.getTransactions().get(0).getAmount();
        for (Transaction transaction : bankAccount.getTransactions()){
            if (transaction.isDeposit()){
                sum += transaction.getAmount();
                if (sum > max){
                    max = sum;
                }
            }else{
                sum -= transaction.getAmount();
            }

        }
        return max;
    }

}
