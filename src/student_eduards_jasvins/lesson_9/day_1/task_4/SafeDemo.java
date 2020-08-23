package student_eduards_jasvins.lesson_9.day_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode = 2314;
        safe.pinCode = 2331;

        safe.moneyAmount = 104922;
        safe.moneyAmount = 0;
    }

}
