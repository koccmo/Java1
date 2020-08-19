package student_aleksandra_maksimovic.lesson_7.level_1;

import student_aleksandra_maksimovic.testing.Tester;
import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.List;
import java.util.Map;

@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.splitToWordsTest();
        test.splitToWordsTest2();
        test.splitToWordsTest3();
        test.countWordsTest();
        test.countWordsTest2();
        test.findMostFrequentWordTest();
        test.findMostFrequentWordTest2();
        test.findMostFrequentWordTest3();
        test.findMostFrequentWordTest4();
    }

    WordService wordService = new WordService();
    Tester tester= new Tester();

    public void splitToWordsTest() {
    	@CodeReviewComment(teacher = "List должен быть параметризирован тем типом, что в нём хранится List<String>")
        List result = wordService.splitString("one one two two");
        List expectedResult = List.of("one", "one", "two", "two");
        tester.check(result.equals(expectedResult), "Split to words test #1");
    }

    public void splitToWordsTest2() {
        List result = wordService.splitString("");
        List expectedResult = List.of();
        tester.check(result.equals(expectedResult), "Split to words test #2 ,if empty string");
    }

    public void splitToWordsTest3() {
        List result = wordService.splitString("one");
        List expectedResult = List.of("one");
        tester.check((result.equals(expectedResult)), "Split to words test #3 ,if only one word");
    }

    public void countWordsTest() {
		@CodeReviewComment(teacher = "Map должен быть параметризирован теми типами, что в нём хранятся Map<String, Integer>")
        Map result = wordService.countWords("split is fun fun fun really fun");
        Map expectedResult = Map.of("split", 1, "is", 1, "fun", 4, "really", 1);
        tester.check(result.equals(expectedResult), "countWordsTest #1");
    }

    public void countWordsTest2() {
        Map result = wordService.countWords("split is fun");
        Map expectedResult = Map.of("split", 1, "is", 1, "fun", 1);
        tester.check(result.equals(expectedResult), "countWordsTest #2 (everyone the same)");
    }

    public void findMostFrequentWordTest() {
       String result = wordService.findMostFrequentWord("split is fun really fun fun fun");
       tester.check(result.equals("fun"), "Find most frequent word test #1");
    }

    public void findMostFrequentWordTest2() {
        String result = wordService.findMostFrequentWord("fun fun fun sad sad sad dog");
        tester.check(result.equals("fun"), "Find most frequent word test #2,(return first,most frequent)");
    }
    public void findMostFrequentWordTest3() {
        String result = wordService.findMostFrequentWord("dog dog cat cat mouse mouse fish fish");
        tester.check(result.equals("dog"), "Find most frequent word test #3,(if everyone the same)");
    }
    public void findMostFrequentWordTest4() {
        String result = wordService.findMostFrequentWord("");
        tester.check(result.equals(""), "Find most frequent word test #4,(if empty)");
    }
}
