package student_anvars_intezars.home_tasks.lesson_7.day_1;

public class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.mostFrequentWordInTextTest();
        wordServiceTest.splitLineOfTextToWordsTest();
        wordServiceTest.countWordsInTextTest();
    }

    public void mostFrequentWordInTextTest() {
        WordService wordService = new WordService();
        String text = ("My name is Anvar. My name has muslim roots.");
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("My")) {
            System.out.println("Test for finding most frequent word = OK");
        }
        else {
            System.out.println("Test for finding most frequent word = FAIL");
        }
    }

    public void splitLineOfTextToWordsTest() {
        WordService wordService = new WordService();
        String text = ("I believe in programming");
        String[] result = wordService.getTextLineToArray(text);
        if ((result[0].equals("I")) && (result[1].equals("believe")) && (result[2].equals("in") && result[3].equals("programming"))) {
            //System.out.println(Arrays.toString(result));
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
        String[] result = wordService.getTextLineToArray(text);
        String mostFrequentWord = wordService.countWordsInText(result);
        if(mostFrequentWord.equals("text")) {
            System.out.println("Test for counting words = OK");
        }
        else {
            System.out.println("Test for counting words = FAIL");
        }
    }
}

