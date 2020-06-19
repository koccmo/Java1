package student_valerija_ionova.lesson_3.hometasks.day_6.task_24;

public class WashMachine {
    private String mark;
    private double price;
    private boolean isDrying;

    public WashMachine(String mark, double price, boolean isDrying){
        this.mark=mark;
        this.price = price;
        this.isDrying = isDrying;
    }

    public void presentation(){
        System.out.print("Эта замечательная машина марки "+this.mark+". Её цена "+price+" EUR. ");

        if (this.isDrying){
            System.out.println("У неё есть сушка! Ура!");
        }
        else{
            System.out.println("У неё нет сушки! О, печаль!");
        }
    }

    public void on(){
        System.out.print("Включаем машину и... ");
        if (this.price>200){
            System.out.println("Буль");
        }
        else{
            System.out.println("Дррр...дрр...Бррррр...Бумс!");
        }

    }

    public void of(){
        System.out.print("Выключаем машину и слышим: ");
        if (this.price>200){
            System.out.println("Ваши носочки постираны и свежи!");
        }
        else{
            System.out.println("Сгрызла твои носки, злобный экономист!");
        }
    }

}
