package student_alexey_tretyakov.lesson_8.homework.level_3.Task_13;

class StreetCat extends Cat{
    String colorCat;
    StreetCat (String name){
        super(name);
        this.colorCat = "black";
    }
    @Override
    void voice (){
        System.out.println("Myau, myau");
    }
}