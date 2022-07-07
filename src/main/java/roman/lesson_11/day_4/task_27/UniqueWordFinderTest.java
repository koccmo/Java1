package roman.lesson_11.day_4.task_27;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest();
    }

    void uniqueWordFinderTest() {
        String text = "hello hello Roman Tanya";
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.add("Roman");
        uniqueWords.add("Tanya");
        uniqueWords.add("hello");
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        checkResult(uniqueWordFinder.find(text).equals(uniqueWords),
                "Unique word finder in text");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test = OK!");
        } else {
            System.out.println(nameOfTest + " Test = FAIL!");
        }
    }
}
