package student_igors_bartkevics.lesson_11.homework.level_4_junior.task_27;

import java.util.HashSet;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.findWhenInputDoesNotHaveSameWordsTest();
        test.findWhenInputHaveSameWordsTest();
    }

    void findWhenInputDoesNotHaveSameWordsTest() {

        String text = "Greatly cottage thought fortune no mention he";
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.add("Greatly");
        uniqueWords.add("cottage");
        uniqueWords.add("thought");
        uniqueWords.add("fortune");
        uniqueWords.add("no");
        uniqueWords.add("mention");
        uniqueWords.add("he");
        UniqueWordFinder finder = new UniqueWordFinder();

        boolean condition = finder.find(text).equals(uniqueWords);
        checkResult(condition, "Find unique words when input doesn't have same words");
    }

    void findWhenInputHaveSameWordsTest() {

        String text = "Greatly cottage thought fortune no mention he he cottage no";
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.add("Greatly");
        uniqueWords.add("cottage");
        uniqueWords.add("thought");
        uniqueWords.add("fortune");
        uniqueWords.add("no");
        uniqueWords.add("mention");
        uniqueWords.add("he");
        UniqueWordFinder finder = new UniqueWordFinder();

        boolean condition = finder.find(text).equals(uniqueWords);
        checkResult(condition, "Find unique words when input have same words");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
