package student_roberts_kupcs.lesson_7.homework.level_1.level_6.task_13;

//Разработать класс с методом, который копирует числа в заданном диапазоне
//из одного массива в другой:
//
//int[] copyInRange(int[] in, int leftBound, int rightBound) - вернуть новый массив,
//в который входят только те числа, который находятся в рамках границы включительно.
//Размер выходного массива должен быть равен количеству элементов в нем.
//
//Логику необходимо реализовать в отдельном классе Copy.
//
//Написать тестовые сценарии для класса Copy в классе CopyTest.
//Все тестовые сценарии должны отрабатывать без ошибок.

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А где тесты? Нет тестов, нет доказательства что этот код работает!")
class Copy {
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] newA = new int[in.length];
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if ((in[i] >= leftBound - 1) && ( in[i] <= rightBound + 1)) {
                newA[count] = in[i];
                count++;
            }
        }
        int[] out = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if ((in[i] >= leftBound - 1) && (in[i] <= rightBound + 1)) {
                out[index] = in[i];
                index++;

            }

        }
        return out;
    }

}
