package student_volodya_danilin.lesson_9.level_1.Task_2;

/*
Создайте класс ракета и сделайте так,
что бы это класс был доступен только внутри того пакета, в котором он находится.
Каким оператором доступа для этого надо воспользоваться?
 */

// default'ным оператором доступа, aka package-private

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rocket {
}
