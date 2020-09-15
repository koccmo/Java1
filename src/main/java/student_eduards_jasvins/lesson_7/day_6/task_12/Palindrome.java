package student_eduards_jasvins.lesson_7.day_6.task_12;

import java.util.Arrays;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Palindrome {

	@CodeReviewComment(teacher = "Этот метод всегда возвращает false?")
    public boolean isPalindrome(String text) {
        char[] myArray = text.toCharArray();
        int size = myArray.length;
        char[] original = Arrays.copyOf(myArray, myArray.length);

        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size - i - 1];
            myArray[size - i - 1] = temp;
        }
        System.out.println("Original Array" + Arrays.toString(original));

        System.out.println("Reverse Array" + Arrays.toString(myArray));

        if (Arrays.equals(myArray, original)) {
            System.out.println("Entered text is a palindrome");
        } else {
            System.out.println("Entered text is not a palindrome");
        }
        return false;
    }
}
