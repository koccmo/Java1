package student_alexey_tretyakov.lesson_8.homework.level_2;

public class Task_7 {
    class Tvset {
        String tvSize;
        String tvModel;
        Tvset (String tvSize, String tvModel){
            this.tvSize = tvSize;
            this.tvModel = tvModel;
    }
    }

    class NewTvset extends Tvset{
        String modelYear;
        NewTvset (String tvSize, String tvModel,String year){
            super(tvSize,tvModel);
            this.modelYear = year;
        }
    }
}
