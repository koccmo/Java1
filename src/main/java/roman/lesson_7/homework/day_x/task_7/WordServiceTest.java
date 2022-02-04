package roman.lesson_7.homework.day_x.task_7;



public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.checkFindMostFrequentWord();
    }

    WordService word = new WordService();

    public void checkFindMostFrequentWord() {
        String text = "текст просто текст просто";
        String expectedAnswer = "текст";
        checkResult(expectedAnswer.equals(word.findMostFrequentWord(text)),
                "Check Find Most Frequent Word");
    }


    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test - OK!!");
        } else {
            System.out.println(nameOfTest + " test - FAIL!!!");
        }
    }
}
