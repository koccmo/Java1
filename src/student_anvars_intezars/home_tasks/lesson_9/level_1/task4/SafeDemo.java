package student_anvars_intezars.home_tasks.lesson_9.level_1.task4;

class SafeDemo {

    public static void main(String[] args) {

        Safe mySafe = new Safe(12345,1000);
        int currentAmountOfMoney = mySafe.getMoney() - 500;

        System.out.println("Pin Code of the Safe is " + mySafe.getPinCode());
        System.out.println("The amount of money in the safe is " + currentAmountOfMoney);
    }
}
