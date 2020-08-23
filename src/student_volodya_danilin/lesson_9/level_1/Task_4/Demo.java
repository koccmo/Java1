package student_volodya_danilin.lesson_9.level_1.Task_4;

public class Demo {

    public static void main(String [] Args) {

        Safe a = new Safe();

//Мы можем посмотреть значения публичных свойств Safe
        System.out.println("Money amount in safe: " + a.moneyAmount);
        System.out.println("PinCode for safe : " + a.pinCode);

        System.out.println();

//Также можем эти свойства менять
        a.moneyAmount = 100;
        a.pinCode = 5544;
        System.out.println("Money amount in safe : " + a.moneyAmount);
        System.out.println("PinCode for safe : " + a.pinCode);

    }

}
