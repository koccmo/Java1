package student_igors_bartkevics.lesson_12.homework.level_3_junior.task_20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) { // так как ArithmeticException является наследником
                                         // Exceptions, то если необходимо отловить отдельно
                                        // ArithmeticException - это надо сделать до того,
                                       // как отлавливать Exception. В противном случае исключения
                                      // ArithmeticException будут уже отловлены конструкцией
                                     // catch (Exception e)
        } catch (Exception e) {

        }

    }

}
