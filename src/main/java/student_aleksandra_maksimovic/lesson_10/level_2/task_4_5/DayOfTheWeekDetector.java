package student_aleksandra_maksimovic.lesson_10.level_2.task_4_5;

import teacher.codereview.CodeReview;

/*

Создайте для этого класса интерфейс DayOfTheWeekDetector.
Сделайте так, чтобы класс DayOfTheWeekDetectorIfVersion реализовывал
интерфейс DayOfTheWeekDetector.
 */
@CodeReview(approved = true)
interface DayOfTheWeekDetector {
    String detectDayName(int number);
}
