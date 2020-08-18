package student_aleksandra_maksimovic.lesson_8.level_3.task_13;

class PolarBear extends Mammals {
    public PolarBear(boolean breatheAir, boolean babiesFeedMilk) {
        super(breatheAir, babiesFeedMilk);
    }

    @Override
    String habitat() {
        return "Circumpolar regions - north hemisphere";
    }

    @Override
    int lifespan() {
        return 20;
    }
}
