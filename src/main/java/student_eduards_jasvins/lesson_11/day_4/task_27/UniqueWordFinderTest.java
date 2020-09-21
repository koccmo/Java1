package student_eduards_jasvins.lesson_11.day_4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.findUniqueWords();
    }

    void checkResult(String name, boolean condition) {
        if (condition) {
            System.out.println(name + "= OK.");
        } else {
            System.out.println(name + "= Fail.");
        }
    }

    void findUniqueWords() {
        String text = "Today is a very good day for start something new!";
        Set<String> uniqueWord = new HashSet<>();

        uniqueWord.add("Today");
        uniqueWord.add("is");
        uniqueWord.add("a");
        uniqueWord.add("very");
        uniqueWord.add("good");
        uniqueWord.add("day");
        uniqueWord.add("for");
        uniqueWord.add("start");
        uniqueWord.add("something");
        uniqueWord.add("new!");

        UniqueWordFinder wordFinder = new UniqueWordFinder();
        boolean condition = wordFinder.find(text).equals(uniqueWord);
        checkResult("Unique Words Test ", condition);
    }
}
