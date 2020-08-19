package student_jaroslav_brutan.lesson_7.day_6.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Palindrome {

    boolean isPalindrome(String text){
        String mainText = text.toLowerCase().replaceAll("[^A-Za-z^]", "");
        StringBuffer palText = new StringBuffer(mainText).reverse();
        boolean result = true;
        for (int i = 0; i < mainText.length();i++){
            if (mainText.charAt(i) != palText.charAt(i)){
                result = false;
                System.out.println("Word is not a palindrome!");
                break;
            } else {
                System.out.println("Word is a palindrome!");
                break;
            }
        }
        return result;


    }
}
