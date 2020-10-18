package student_alexey_tretyakov.lesson_8.homework.level_4;

class Circle extends Shape {

        private double radius;

        Circle(String title,double radius) {
            super(title);
            this.radius = radius;
        }
        @Override
        double calculateArea(){
            return Math.PI * Math.pow( radius, 2 );
        }
        @Override
        double calculatePerimeter(){
            return Math.PI * 2 * radius;
        }

}
