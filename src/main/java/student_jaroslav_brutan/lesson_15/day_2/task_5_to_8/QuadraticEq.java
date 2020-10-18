package student_jaroslav_brutan.lesson_15.day_2.task_5_to_8;


public class QuadraticEq {

   public String calc(double a, double b, double c) {
       double discriminant = b * b - 4 * a * c;
       if (discriminant > 0) {
           return calculateIfDiscriminantIsAboveZero(a, b, discriminant);
       } else if (discriminant == 0) {
           return calculateIfDiscriminantIsNull(a, b);
       } else {
           return calculateIfDiscriminantIsLessThenZero();
       }
   }

        private String calculateIfDiscriminantIsAboveZero(double a, double b, double discriminant){
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }

        private String calculateIfDiscriminantIsNull(double a, double b){
            double x;
            x = -b / (2 * a);
            return "x = " + x;
       }

        private String calculateIfDiscriminantIsLessThenZero(){
            return "Equation has no roots";
       }
}
