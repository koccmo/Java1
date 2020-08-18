package student_aleksandra_maksimovic.lesson_8.level_3.task_13;

abstract class Mammals {
    private boolean breatheAir;
    private boolean babiesFeedMilk;

    public Mammals(boolean breatheAir, boolean babiesFeedMilk) {
        this.breatheAir = breatheAir;
        this.babiesFeedMilk = babiesFeedMilk;
    }

    abstract String habitat();
    abstract int lifespan();
}