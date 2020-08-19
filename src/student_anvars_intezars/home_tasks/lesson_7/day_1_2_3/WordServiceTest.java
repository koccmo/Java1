package student_anvars_intezars.home_tasks.lesson_7.day_1_2_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.mostFrequentWordInTextTest();
        wordServiceTest.splitLineOfTextToWordsTest();
        wordServiceTest.countWordsInTextTest();
        wordServiceTest.mostFrequentWordInTextTest2();
    }

    public void mostFrequentWordInTextTest() {
        WordService wordService = new WordService();
        String textExample = ("My name is Anvar. My name has muslim roots.");
        String resultAfterSearch = wordService.findMostFrequentWord(textExample);
        if (resultAfterSearch.equals("My")) {
            System.out.println("Test for finding most frequent word = OK");
        }
        else {
            System.out.println("Test for finding most frequent word = FAIL");
        }
    }

    public void splitLineOfTextToWordsTest() {
        WordService wordService = new WordService();
        String textExample = ("I believe in programming");
        String[] textAfterSplit = wordService.getTextLineToArray(textExample);
        if ((textAfterSplit[0].equals("I"))
                && (textAfterSplit[1].equals("believe"))
                && (textAfterSplit[2].equals("in")
                && textAfterSplit[3].equals("programming"))) {
            //System.out.println(Arrays.toString(result));
            System.out.println();
            System.out.println("Test for splitting line of text to words = OK");
            System.out.println();
        }
        else {
            System.out.println("Test for splitting line of text to words = FAIL");
        }
    }

    public void countWordsInTextTest() {
        WordService wordService = new WordService();
        String text = ("How many text words in this text");
        String[] textAfterSplit = wordService.getTextLineToArray(text);
        String mostFrequentWord = wordService.countWordsAfterTextIsSplit(textAfterSplit);
        if(mostFrequentWord.equals("text")) {
            System.out.println("Test for counting words = OK");
        }
        else {
            System.out.println("Test for counting words = FAIL");
        }
    }

    public void mostFrequentWordInTextTest2() {
        WordService wordService = new WordService();
        String textExample = ("Our group is the best group");
        System.out.println();
        String resultAfterSearch = wordService.findMostFrequentWord(textExample);
        if(resultAfterSearch.equals("group")) {
            System.out.println("Second test for finding most frequent word = OK");
        }
        else {
            System.out.println("Second test for finding most frequent word = FAIL");
        }
    }
}

