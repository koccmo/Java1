package student_eduards_jasvins.lesson_7.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.mostFrequentWord();
    }

    private void mostFrequentWord() {
        WordService wordService = new WordService();
        String text = "how much word how i can use in this how text";
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("how")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}



