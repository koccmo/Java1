package student_alexey_tretyakov.lesson_9.homework.level_1.task_5;

class SafeBoxDemo {

    public static void main(String[] args) {
        SafeBox safeBox = new SafeBox();
        System.out.println("Pin code is " + safeBox.getPinCode());
        System.out.println("Money in safe =  " + safeBox.getBoxMoney("1234"));
        System.out.println("Money in safe =  " + safeBox.getBoxMoney("2234"));

    }

}
