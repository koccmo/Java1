package student_anvars_intezars.home_tasks.lesson_7.day_6.task10;


import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "import org.w3c.dom.ls.LSOutput - не используемый импорт, удалить")
//импорт удален
class PowerCalculator {

    public int raiseNumberToPower(int number, int power) {
        int resultOrRaisingToPower = 1;
        for (int i = 1; i <= power; i++) {
            resultOrRaisingToPower = resultOrRaisingToPower * number;
        }
        return resultOrRaisingToPower;
    }
}
