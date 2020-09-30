package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

abstract class Shape {

    private String title;

    Shape (String title){
        this.title = title;
    }

    abstract double calculatePerimeter ();
    abstract double calculateArea ();

}
