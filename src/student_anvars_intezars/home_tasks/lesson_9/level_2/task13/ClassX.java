package student_anvars_intezars.home_tasks.lesson_9.level_2.task13;

class ClassX {

    public ClassX(int i) {
        System.out.println(1);
    }

    public ClassX() {

    }
}

class ClassY extends ClassX {
    public ClassY() {
        super();
        System.out.println(2);
    }
}
