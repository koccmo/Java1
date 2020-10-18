package student_alexey_tretyakov.lesson_8.homework.level_3.Task_13;

class HomeCat extends Cat {
    String ageCat ;
    HomeCat (String name){
        super(name);
        this.ageCat="3";
    }
    @Override
    void voice(){
        System.out.println("Mur, mur");
    }
}
