package student_anvars_intezars.home_tasks.lesson_9.level_2.task11;

public class Box {

    protected String size;

    protected Box(String size) {
        this.size = size;
    }

    class AnotherBox extends Box {
        protected String material;

        protected AnotherBox(String size) {
            super(size);
        }
    }
}


