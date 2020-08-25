package student_anvars_intezars.home_tasks.lesson_9.level_1.task5;

class NewSafe {

    private int password;
    private int money;

    NewSafe(int password, int money) {
        this.password = password;
        this.money = money;
    }

    public int getMoney(int password, int amount) {
        if (isPassWordCorrect(password)) {
           money = money - amount;
           return amount;
        } else {
            return 0;
        }
    }

    public int putMoney (int password, int amount) {
        if (isPassWordCorrect(password)) {
            money = money + amount;
        }
        return money;
    }

    boolean isPassWordCorrect(int password) {
        return this.password == password;
    }
}


