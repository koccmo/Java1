package student_aleksandra_maksimovic.lesson_8.level_3.task_13;

class BlueWhale extends Mammals {

    public BlueWhale(boolean breatheAir, boolean babiesFeedMilk) {
        super(breatheAir, babiesFeedMilk);
    }
    @Override
    String habitat() {
        return "Whole world ocean";
    }

    @Override
    int lifespan() {
        return 90 ;
    }
}