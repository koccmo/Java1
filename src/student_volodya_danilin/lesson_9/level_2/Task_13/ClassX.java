package student_volodya_danilin.lesson_9.level_2.Task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}