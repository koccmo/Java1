package student_alexey_tretyakov.lesson_8.homework.level_4;


  public   abstract class Shape {

        private String title;

        Shape(String title) {
            this.title = title;
        }

        abstract double calculateArea();
        abstract double calculatePerimeter();

    }


