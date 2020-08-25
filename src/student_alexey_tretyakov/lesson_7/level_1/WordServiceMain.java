package student_alexey_tretyakov.lesson_7.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceMain {
    public static void main(String[] args) {
        String string = "Привет ! Привет всем ! Привет всем программистам ! Привет всем программистам Java !";
        WordService wordService = new WordService();
        System.out.println( wordService.findMostFrequentWord( string ) );
    }
}
