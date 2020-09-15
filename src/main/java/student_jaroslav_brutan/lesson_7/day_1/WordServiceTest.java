package student_jaroslav_brutan.lesson_7.day_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Можно было придумать и больше разных тестов.")
public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.mostFrequentWordTest();
    }

    void mostFrequentWordTest(){
        WordService wordService = new WordService();
        String text = "privet privet kak dela";
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("privet")){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }
}
